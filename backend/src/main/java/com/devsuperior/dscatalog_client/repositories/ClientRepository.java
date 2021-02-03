package com.devsuperior.dscatalog_client.repositories;

import com.devsuperior.dscatalog_client.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
