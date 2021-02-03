package com.devsuperior.dscatalog_client.services;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dscatalog_client.dto.ClientDTO;
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
    public List<ClientDTO> findAll() {
        List<Client> list = repository.findAll();
        return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
    }
}
