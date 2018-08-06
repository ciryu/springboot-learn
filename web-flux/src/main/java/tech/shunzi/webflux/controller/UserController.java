package tech.shunzi.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import tech.shunzi.webflux.exception.ResourceNotFoundException;
import tech.shunzi.webflux.model.User;
import tech.shunzi.webflux.service.UserService;

import java.util.Objects;

/**
 * Mono: (0 - 1) is similar to Optional
 * Flux: (0 - N) is similar to Observable
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Error handler handle self-define exception
     */
    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Resource Not Found")
    @ExceptionHandler(ResourceNotFoundException.class)
    public  void NOT_FOUND()
    {
    }

    @GetMapping("")
    public Flux<User> list()
    {
        return userService.list();
    }

    @GetMapping("/{id}")
    public Mono<User> getById(@PathVariable("id") final String id)
    {
        return userService.getById(id);
    }

    @PostMapping("")
    public Mono<User> create(@RequestBody final User user)
    {
        return userService.createOrUpdate(user);
    }

    @PutMapping("/{id}")
    public Mono<User> update(@PathVariable("id") final String id, @RequestBody final User user)
    {
        Objects.requireNonNull(user);
        user.setId(id);
        return this.userService.createOrUpdate(user);
    }

    @DeleteMapping("/{id}")
    public Mono<User>  delete(@PathVariable("id") final String id)
    {
        return this.userService.delete(id);
    }

}
