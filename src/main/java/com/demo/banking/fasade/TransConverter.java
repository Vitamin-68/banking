package com.demo.banking.fasade;

import com.demo.banking.dao_entity.Transaction;
import com.demo.banking.dto_entity.TransactDto;
import org.springframework.stereotype.Component;

@Component
public class TransConverter {

  public Transaction convertDtoToTransact(TransactDto transactDto) {
    Transaction transaction = new Transaction();
    transaction.setId(transactDto.getId());
    transaction.setSourceAcc(transactDto.getSourceAcc());
    transaction.setDestAcc(transactDto.getDestAcc());
    transaction.setAmount(transactDto.getAmount());
    transaction.setReason(transactDto.getReason());
    transaction.setDate(transactDto.getDate());
    return transaction;
  }

  public TransactDto convertTransactToDto(Transaction transaction) {
    TransactDto transactDto = new TransactDto();
    transactDto.setId(transaction.getId());
    transactDto.setSourceAcc(transaction.getSourceAcc());
    transactDto.setDestAcc(transaction.getDestAcc());
    transactDto.setAmount(transaction.getAmount());
    transactDto.setReason(transaction.getReason());
    transactDto.setDate(transaction.getDate());
        return transactDto;
  }









//  public Client convertDtoToClient(ClientDto clientDto) {
//    Client client = new Client();
//    client.setId(clientDto.getId());
//    client.setFirstName(clientDto.getFirstName());
//    client.setLastName(clientDto.getLastName());
//    return client;
//  }
//
//  public ClientDto convertClientToDto(Client client) {
//    ClientDto clientDto = new ClientDto();
//    clientDto.setId(client.getId());
//    clientDto.setFirstName(client.getFirstName());
//    clientDto.setLastName(client.getLastName());
//    clientDto.setListAccounts(convertListAccountToListAccountDto(client.getListAccounts()));
//    return clientDto;
}
