package com.demo.banking.dto_service;

import com.demo.banking.exception.MyException;
import com.demo.banking.dto_entity.ClientDto;

public interface ClientDtoServiceImpl {

  ClientDto create(ClientDto clientDto) throws MyException;
  ClientDto findById(Integer id);
//  List<ClientDto> findAll();
//  ClientDto update(ClientDto clientDto);
//  void deleteClient(Integer id);
}
