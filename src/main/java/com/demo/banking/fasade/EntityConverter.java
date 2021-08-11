package com.demo.banking.fasade;

import com.demo.banking.dao_entity.Account;
import com.demo.banking.dao_entity.Client;
import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.dto_entity.ClientDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class EntityConverter {

  public Client convertDtoToClient(ClientDto clientDto) {
    Client client = new Client();
    client.setId(clientDto.getId());
    client.setFirstName(clientDto.getFirstName());
    client.setLastName(clientDto.getLastName());
    return client;
  }

  public ClientDto convertClientToDto(Client client) {
    ClientDto clientDto = new ClientDto();
    clientDto.setId(client.getId());
    clientDto.setFirstName(client.getFirstName());
    clientDto.setLastName(client.getLastName());
    clientDto.setListAccounts(convertListAccountToListAccountDto(client.getListAccounts()));
    return clientDto;
  }

  private List<AccountDto> convertListAccountToListAccountDto(List<Account> accounts) {
    List<AccountDto> accountDtos = new ArrayList<>();
    for (Account account : accounts) {
      AccountDto accDto = new AccountDto();
      accDto.setId(account.getId());
      accDto.setAccountType(account.getAccountType());
      accDto.setAccountNum(account.getAccountNum());
      accDto.setBalance(account.getBalance());
      accountDtos.add(accDto);
    }
    return accountDtos;
  }

  public List<Account> convertListAccountDtoToListAccount(List<AccountDto> accountDtos) {
    List<Account> accounts = new ArrayList<>();
    for (AccountDto accountDto : accountDtos) {
      Account acc = new Account();
      acc.setAccountNum(accountDto.getAccountNum());
      acc.setAccountType(accountDto.getAccountType());
      acc.setBalance(accountDto.getBalance());
      accounts.add(acc);
    }
    return accounts;
  }

  private Account convertDtoToAccount(AccountDto accountDto) {
    Account account = new Account();
    account.setId(accountDto.getId());
    account.setAccountNum(accountDto.getAccountNum());
    account.setAccountType(accountDto.getAccountType());
    account.setBalance(accountDto.getBalance());
    return account;
  }

}
