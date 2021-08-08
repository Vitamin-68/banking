package com.demo.banking.repository;

import com.demo.banking.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Integer> {

//  Client FindByClientId(Integer id);

}
