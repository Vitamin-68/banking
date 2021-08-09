package com.demo.banking.controller;

import com.demo.banking.dto.AccountDto;
import com.demo.banking.exception.MyException;
import com.demo.banking.services.AccountDtoService;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/accounts")
@AllArgsConstructor
public class AccountController {

  private final AccountDtoService accountDtoService;

  @PostMapping("/saveacc")
  public AccountDto createAccount(@RequestBody AccountDto accountDto) throws MyException {
    log.info("New client created: " + accountDto);
    return accountDtoService.create(accountDto);
  }

//  @GetMapping("/findByClientId")
//  public List<AccountDto> findById(@RequestParam Integer id) {
//    log.info("Accounts found by ID: " + id);
//    return accountDtoService.findByClientIn(id);
//  }
}
