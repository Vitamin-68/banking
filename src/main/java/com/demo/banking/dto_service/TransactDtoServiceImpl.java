package com.demo.banking.dto_service;

import com.demo.banking.dto_entity.TransactDto;
import com.demo.banking.exception.MyException;

public interface TransactDtoServiceImpl {

  TransactDto create(TransactDto transactDto) throws MyException;
}
