package com.demo.banking.dto_service;

import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.exception.MyException;
import com.demo.banking.dto_entity.ClientDto;
import java.util.Map;

public interface ClientDtoServiceImpl {

  ClientDto create(ClientDto clientDto) throws MyException;
  ClientDto findById(Integer id);
  Integer payment(AccountDto accountDto, Map<String, String> inputMap);
  //  List<ClientDto> findAll();
//  ClientDto update(ClientDto clientDto);
//  void deleteClient(Integer id);
}
