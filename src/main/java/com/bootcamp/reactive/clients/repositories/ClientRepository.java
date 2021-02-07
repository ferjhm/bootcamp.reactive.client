package com.bootcamp.reactive.clients.repositories;

import com.bootcamp.reactive.clients.persistence.entities.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.*;

@Repository
public interface ClientRepository extends ReactiveMongoRepository <Client, String> {

    public Mono<Client> findByDni(String dni);

}
