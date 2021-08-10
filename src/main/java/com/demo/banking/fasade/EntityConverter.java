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
//    client.setListAccounts(convertDtoListAccount(clientDto.getListAccounts()));
//    client.setListAccounts(convertDtoListAccount(clientDto));
    return client;
  }

  public ClientDto convertClientToDto(Client client) {
    ClientDto clientDto = new ClientDto();
    clientDto.setId(client.getId());
    clientDto.setFirstName(client.getFirstName());
    clientDto.setLastName(client.getLastName());
    return clientDto;
  }

  public Account convertDtoToAccount(AccountDto accountDto) {
    Account account = new Account();
    account.setId(accountDto.getId());
    account.setAccountNum(accountDto.getAccountNum());
    account.setAccountType(accountDto.getAccountType());
    account.setBalance(accountDto.getBalance());
//    account.setClient(accountDto.getClient());
    return account;
  }

  public AccountDto convertAccountToDto(Account account) {
    AccountDto accountDto = new AccountDto();
    accountDto.setId(account.getId());
    accountDto.setAccountNum(account.getAccountNum());
    accountDto.setAccountType(account.getAccountType());
    accountDto.setBalance(account.getBalance());
//    accountDto.setClient(account.getClient());
    return accountDto;
  }

//  List<Account> convertDtoListAccount(List<AccountDto> accountDtos) {
//  List<Account> convertDtoListAccount(ClientDto clientDto) {
//    List<AccountDto> accountDtos = clientDto.getListAccounts();
//    List<Account> accounts = new ArrayList<>();
//    Account acc = new Account();
//    for (AccountDto accountDto : accountDtos) {
////      acc.setId(accountDtos.get(i).getId());
//      acc.setAccountNum(accountDto.getAccountNum());
//      acc.setType(accountDto.getType());
//      acc.setBalance(accountDto.getBalance());
//
//      acc.setClient(accountDto.getClient());
//      accounts.add(acc);
//
//    }
//    return  accounts;
//  }

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
}
