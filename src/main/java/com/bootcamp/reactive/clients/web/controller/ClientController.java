package com.bootcamp.reactive.clients.web.controller;

import com.bootcamp.reactive.clients.domain.dto.ClientDto;
import com.bootcamp.reactive.clients.domain.service.ClientService;
import com.bootcamp.reactive.clients.domain.service.ClientServiceImpl;
import com.bootcamp.reactive.clients.persistence.entities.Client;
import com.bootcamp.reactive.clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.*;

@RestController
@RequestMapping("clients")

public class ClientController {

   // @Autowired
   // private ClientRepository clientRepository;

    @Autowired
    private ClientService clienteService;

    @GetMapping("/hola")
    public String hola(){
        return "Hola Mundo";
    }

    @GetMapping("/all")
    public Flux<ClientDto> findAll(){

        return clienteService.listaTodos();

    }

    @GetMapping("/{id}")
    public Mono<ClientDto> listaUno(@PathVariable("id") String dni){

        return clienteService.listarUno(dni);

    }

/*
    @GetMapping("/todos")
    public Flux<ClientDto> listadeTodos(){

        return clienteService.listaTodos();
    }

    @PostMapping("/nuevo")
    public Mono<ClientDto> guardarUno(@RequestBody ClientDto clientDto){

        return clienteService.guardar(clientDto);
    }
*/
}
