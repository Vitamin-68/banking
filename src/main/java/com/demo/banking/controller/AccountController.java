package com.demo.banking.controller;

import com.demo.banking.dto_service.AccountDtoService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/accounts")
@AllArgsConstructor
public class AccountController {

  private final AccountDtoService accountDtoService;

}
