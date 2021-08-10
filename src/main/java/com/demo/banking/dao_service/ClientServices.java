package com.demo.banking.dao_service;

import com.demo.banking.dao_entity.Account;
import com.demo.banking.dao_entity.Client;
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

  public Client updateAcc(Client client, List<Account> accounts) {
    int i = 0;
    while (i < accounts.size()) {
      accounts.get(i).setClient(client);
      i++;
    }
    client.setListAccounts(accounts);

    return clientRepo.saveAndFlush(client);
  }

 }
