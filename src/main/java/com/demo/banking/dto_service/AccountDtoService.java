package com.demo.banking.dto_service;

import com.demo.banking.dao_service.AccountServices;
import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.fasade.EntityConverter;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountDtoService implements AccountDtoServiceImpl {

  private final EntityConverter converter;
  private final AccountServices accountServices;

//  @Override
//  public List<AccountDto> findByClientIn(Integer id) {
//    List<AccountDto> accountDtos = new ArrayList<>();
//    accountServices.findByClientIn(id)
//        .forEach(la -> accountDtos.add(converter.convertAccountToDto(la)));
//    return accountDtos;
//  }

  @Override
  public List<AccountDto> findById(Integer id) {
    return null;
  }

}
