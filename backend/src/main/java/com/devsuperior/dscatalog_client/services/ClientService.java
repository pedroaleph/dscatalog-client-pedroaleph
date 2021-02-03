package com.devsuperior.dscatalog_client.services;

import java.util.List;

import com.devsuperior.dscatalog_client.entities.Client;
import com.devsuperior.dscatalog_client.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<Client> findAll() {
        return repository.findAll();
    }
}
