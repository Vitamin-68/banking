package com.demo.banking.services;

import com.demo.banking.dto.AccountDto;
import com.demo.banking.dto.ClientDto;
import com.demo.banking.entity.Account;
import com.demo.banking.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class EntityConverter {

  Client convertDtoToClient(ClientDto clientDto) {
    Client client = new Client();
    client.setId(clientDto.getId());
    client.setFirstName(clientDto.getFirstName());
    client.setLastName(clientDto.getLastName());
    return client;
  }

  ClientDto convertClientToDto(Client client) {
    ClientDto clientDto = new ClientDto();
    clientDto.setId(client.getId());
    clientDto.setFirstName(client.getFirstName());
    clientDto.setLastName(client.getLastName());
    return clientDto;
  }

  Account convertDtoToAccount(AccountDto accountDto) {
    Account account = new Account();
    account.setId(accountDto.getId());
    account.setAccountNum(accountDto.getAccountNum());
    account.setType(accountDto.getType());
    account.setBalance(accountDto.getBalance());
    account.setClient(accountDto.getClient());
    return account;
  }

  AccountDto convertAccountToDto(Account account) {
    AccountDto accountDto = new AccountDto();
    accountDto.setId(account.getId());
    accountDto.setAccountNum(account.getAccountNum());
    accountDto.setType(account.getType());
    accountDto.setBalance(account.getBalance());
    accountDto.setClient(account.getClient());
    return accountDto;
  }

}
