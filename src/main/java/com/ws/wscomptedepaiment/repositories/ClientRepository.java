package com.ws.wscomptedepaiment.repositories;

import com.ws.wscomptedepaiment.entities.Client;
import com.ws.wscomptedepaiment.entities.Compte;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends MongoRepository<Client,String> {
}
