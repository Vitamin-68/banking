package com.demo.banking.fasade;

import com.demo.banking.dao_entity.Account;
import com.demo.banking.dto_entity.AccountDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class AccConverter {



  private AccountDto convertAccountToDto(Account account) {
    AccountDto accountDto = new AccountDto();
    accountDto.setId(account.getId());
    accountDto.setAccountNum(account.getAccountNum());
    accountDto.setAccountType(account.getAccountType());
    accountDto.setBalance(account.getBalance());
    return accountDto;
  }





}
