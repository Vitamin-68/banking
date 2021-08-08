package com.demo.banking.services;

import com.demo.banking.exception.MyException;
import com.demo.banking.dto.ClientDto;
import java.util.List;

public interface ClientDtoServiceImpl {

  ClientDto create(ClientDto clientDto) throws MyException;
  ClientDto findById(Integer id);
//  List<ClientDto> findAll();
//  ClientDto update(ClientDto clientDto);
//  void deleteClient(Integer id);
}
