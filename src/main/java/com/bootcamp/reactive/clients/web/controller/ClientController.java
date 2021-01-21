package com.bootcamp.reactive.clients.web.controller;

import com.bootcamp.reactive.clients.persistence.entities.Client;
import com.bootcamp.reactive.clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("clients")

public class ClientController {

    @Autowired
    private ClientRepository clientRepository;


    @GetMapping("/hola")
    public String hola(){
        return "Hola Mundo";
    }

    @GetMapping("/all")
    public Flux<Client> findAll(){
        return clientRepository.findAll();
    }

}
