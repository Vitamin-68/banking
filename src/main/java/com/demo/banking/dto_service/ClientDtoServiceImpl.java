package com.demo.banking.dto_service;

import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.exception.MyException;
import com.demo.banking.dto_entity.ClientDto;
import java.util.Map;

public interface ClientDtoServiceImpl {

  ClientDto create(ClientDto clientDto) throws MyException;
  ClientDto findById(Integer id);
  Map<String, String> payment(AccountDto accountDtoSrc, AccountDto accountDtoDest, Map<String, String> inputMap);
}
