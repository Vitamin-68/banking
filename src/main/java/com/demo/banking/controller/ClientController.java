package com.demo.banking.controller;

import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.dto_entity.ClientDto;
import com.demo.banking.dto_service.AccountDtoService;
import com.demo.banking.exception.MyException;
import com.demo.banking.dto_service.ClientDtoService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

  private final ClientDtoService clientDtoService;
  private final AccountDtoService accountDtoService;

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Integer createClient(@RequestBody ClientDto clientDto) throws MyException {
    log.info("New client created: " + clientDto);
    return clientDtoService.create(clientDto).getId();
  }

  @PostMapping("/saveAll")
  public ClientDto createAll(@RequestBody ClientDto clientDto) throws MyException {
    log.info("New client created: " + clientDto);
    return clientDtoService.create(clientDto);
  }


  @GetMapping("/findById")
  @ResponseStatus(HttpStatus.OK)
  public List<AccountDto> findById(@RequestParam Integer id) {
    log.info("Client found by ID: " + id);
    return clientDtoService.findById(id).getListAccounts();
  }

  @PostMapping("/payment")
  public Integer payment(@RequestBody Map<String, String> inputMap) {
    log.info("New payment");
    AccountDto accountDto = accountDtoService.findById(Integer.parseInt(inputMap.get("source_acc_id"))).get(0);
    return clientDtoService.payment(accountDto, inputMap);
  }
}
