package com.demo.banking.services;

import com.demo.banking.dto.AccountDto;
import com.demo.banking.exception.MyException;
import java.util.List;

public interface AccountDtoServiceImpl {

  AccountDto create(AccountDto accountDto) throws MyException;
  List<AccountDto> findByClientIn(Integer id);
}
