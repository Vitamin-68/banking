package com.demo.banking.services;

import com.demo.banking.entity.Client;
import com.demo.banking.repository.ClientRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServices {

  @Autowired
  private final ClientRepo clientRepo;

  public ClientServices(ClientRepo clientRepo) {
    this.clientRepo = clientRepo;
  }

  public Client create(Client client) {
    clientRepo.save(client);
    return client;
  }

  public Client findById(Integer id) {
    Optional<Client> result = clientRepo.findById(id);
    Client client = new Client();
    if (result.isPresent()) {
      client = result.get();
    }
    return client;
  }

 }
