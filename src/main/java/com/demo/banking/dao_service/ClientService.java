package com.demo.banking.dao_service;

import com.demo.banking.dao_entity.Account;
import com.demo.banking.dao_entity.Client;
import com.demo.banking.repository.ClientRepo;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

  @Autowired
  private final ClientRepo clientRepo;

  public ClientService(ClientRepo clientRepo) {
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

  public Map<String, String> payment(Account sourseAccount, Account destAccount,
      Map<String, String> inputMap) {
    double amount = Double.parseDouble(inputMap.get("amount"));
    double curBalance = sourseAccount.getBalance();
    if (curBalance >= amount) {
      sourseAccount.setBalance(curBalance - amount);
      destAccount.setBalance(destAccount.getBalance() + amount);
    }
    return inputMap;


  }

}
