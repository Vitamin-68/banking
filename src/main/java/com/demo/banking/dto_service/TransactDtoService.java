package com.demo.banking.dto_service;

import com.demo.banking.dao_entity.Transaction;
import com.demo.banking.dao_service.TransactService;
import com.demo.banking.dto_entity.TransactDto;
import com.demo.banking.exception.MyException;
import com.demo.banking.fasade.TransConverter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactDtoService implements TransactDtoServiceImpl {

  private final TransConverter converter;
  private final TransactService transactService;

  @Override
  public TransactDto create(TransactDto transactDto) throws MyException {
    Transaction transaction = converter.convertDtoToTransact(transactDto);
    transactService.create(transaction);
    return converter.convertTransactToDto(transaction);
  }
}
