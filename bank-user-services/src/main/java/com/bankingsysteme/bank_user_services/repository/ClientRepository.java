package com.bankingsysteme.bank_user_services.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.bankingsysteme.bank_user_services.model.Client;




@RestResource (path =  "clients")
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
