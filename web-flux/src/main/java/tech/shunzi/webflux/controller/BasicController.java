package tech.shunzi.webflux.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BasicController {

    @RequestMapping("/hello")
    public Mono<String> sayHello()
    {
        return Mono.just("Hello Web Flux");
    }
}
