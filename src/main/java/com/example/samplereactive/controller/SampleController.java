package com.example.samplereactive.controller;


import com.example.samplereactive.entity.Player;
import com.example.samplereactive.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SampleController {


    @Autowired
    PlayerRepository playerRepository;

    @GetMapping("/test")
    public Mono<String> testEndPoint(@RequestParam String testParam) {
        Player player = new Player();
        player.setAge(20);
        player.setName("Amit");

        return playerRepository.save(player).map(x -> {
            return x.getName();
        });

    }
}
