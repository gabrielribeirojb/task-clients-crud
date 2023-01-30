package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
