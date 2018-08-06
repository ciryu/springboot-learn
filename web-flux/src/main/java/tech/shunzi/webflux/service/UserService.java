package tech.shunzi.webflux.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tech.shunzi.webflux.exception.ResourceNotFoundException;
import tech.shunzi.webflux.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Mono: (0 - 1) is similar to Optional
 * Flux: (0 - N) is similar to Observable
 */
@Service
public class UserService {

    private final Map<String, User> data = new ConcurrentHashMap<>();

    public Flux<User> list()
    {
        return Flux.fromIterable(this.data.values());
    }

    public Flux<User> getById(final Flux<String> ids)
    {
        return ids.flatMap(id -> Mono.justOrEmpty(this.data.get(id)));
    }

    public Mono<User> getById(final String id)
    {
        return Mono.justOrEmpty(this.data.get(id)).switchIfEmpty(Mono.error(new ResourceNotFoundException()));
    }

    public Mono<User> createOrUpdate(final User user)
    {
        this.data.put(user.getId(), user);
        return Mono.just(user);
    }

    public Mono<User> delete(final String id)
    {
        return Mono.justOrEmpty(this.data.remove(id));
    }

}
