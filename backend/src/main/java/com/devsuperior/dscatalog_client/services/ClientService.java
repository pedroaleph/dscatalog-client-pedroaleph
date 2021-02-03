package com.devsuperior.dscatalog_client.services;

import java.util.List;

import com.devsuperior.dscatalog_client.entities.Client;
import com.devsuperior.dscatalog_client.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll() {
        return repository.findAll();
    }
}
