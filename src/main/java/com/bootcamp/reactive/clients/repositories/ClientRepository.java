package com.bootcamp.reactive.clients.repositories;

import com.bootcamp.reactive.clients.persistence.entities.Client;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveMongoRepository <Client, String> {
}
