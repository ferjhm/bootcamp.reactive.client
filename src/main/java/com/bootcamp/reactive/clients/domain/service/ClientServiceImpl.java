package com.bootcamp.reactive.clients.domain.service;

import com.bootcamp.reactive.clients.domain.dto.ClientDto;
import com.bootcamp.reactive.clients.persistence.entities.Client;
import com.bootcamp.reactive.clients.persistence.entities.ClientAddress;
import com.bootcamp.reactive.clients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.*;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Flux<ClientDto> listaTodos() {

        return clientRepository.findAll().
                map(p-> new ClientDto(p.get_id(),p.getDni(),p.getName(),p.getOld(),p.getSex(),(ClientAddress) p.getAddress()));


    }

    @Override
    public Mono<ClientDto> listarUno(String id) {

        Mono<ClientDto> valor = clientRepository.findByDni(id).
                map(c-> new ClientDto(c.get_id(),c.getDni(),c.getName(),c.getOld(),c.getSex(), (ClientAddress) c.getAddress()));

        return valor;
    }
/*
    @Override
    public Mono<ClientDto> guardar(ClientDto clientDto) {


        Client clientEntity = new Client(clientDto.get_id(),clientDto.getDni(),clientDto.getName(),clientDto.getOld(),clientDto.getSex(),clientDto.getClientAdress());
        clientRepository.save(clientEntity);


        return null;// clientDto;
        //        map(p-> new ClientDto(p.get_id(),p.getDni(),p.getName(),p.getOld(),p.getSex(),p.getClientAdress()));

        //return null;
    }

    @Override
    public void borrar(String id) {

    }

 */
}
