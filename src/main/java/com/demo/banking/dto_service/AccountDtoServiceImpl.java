package com.demo.banking.dto_service;

import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.exception.MyException;

public interface AccountDtoServiceImpl {

  AccountDto create(AccountDto accountDto) throws MyException;
//  List<AccountDto> findByClientIn(Integer id);
}
