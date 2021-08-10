package com.demo.banking.dto_service;

import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.exception.MyException;
import com.demo.banking.fasade.EntityConverter;
import com.demo.banking.dao_service.AccountServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountDtoService implements AccountDtoServiceImpl {

  private final EntityConverter converter;
  private final AccountServices accountServices;

  @Override
  public AccountDto create(AccountDto accountDto) throws MyException {
    return null;
  }

//  @Override
//  public List<AccountDto> findByClientIn(Integer id) {
//    List<AccountDto> accountDtos = new ArrayList<>();
//    accountServices.findByClientIn(id)
//        .forEach(la -> accountDtos.add(converter.convertAccountToDto(la)));
//    return accountDtos;
//  }
}
