package com.demo.banking.dto_service;

import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.exception.MyException;
import java.util.List;
import java.util.Map;

public interface AccountDtoServiceImpl {

  List<AccountDto> findById(Integer id);

}
