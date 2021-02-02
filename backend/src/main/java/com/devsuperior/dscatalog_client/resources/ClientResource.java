package com.devsuperior.dscatalog_client.resources;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.dscatalog_client.entities.Client;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        List<Client> list = new ArrayList<>();
        return ResponseEntity.ok().body(list);
    }
}
