package com.bootcamp.reactive.clients.domain.service;


import com.bootcamp.reactive.clients.domain.dto.ClientDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientService {

    public Flux<ClientDto> listaTodos();
    public Mono<ClientDto> listarUno(String id);
  /*  public Mono<ClientDto> guardar(ClientDto clientDto);
    public void borrar(String id);
*/

}
