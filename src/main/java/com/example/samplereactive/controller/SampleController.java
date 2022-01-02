package com.example.samplereactive.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {


    @GetMapping("/test")
    public Mono<String> testEndPoint(@RequestParam String testParam) {
        return Mono.just(testParam);
    }
}
