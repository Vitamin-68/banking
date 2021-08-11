package com.demo.banking.controller;

import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.dto_entity.ClientDto;
import com.demo.banking.dto_service.AccountDtoService;
import com.demo.banking.dto_service.ClientDtoService;
import com.demo.banking.dto_service.TransactDtoService;
import com.demo.banking.exception.MyException;
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
public class Controller {

  private final ClientDtoService clientDtoService;
  private final AccountDtoService accountDtoService;
  private final TransactDtoService transactDtoService;

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
  public String payment(@RequestBody Map<String, String> inputMap) {
    log.info("New payment");
    AccountDto accountDtoSrc = accountDtoService.findById(Integer.parseInt(inputMap.get("source_acc_id")));
    AccountDto accountDtoDest = accountDtoService.findById(Integer.parseInt(inputMap.get("dest_acc_id")));

    return clientDtoService.payment(accountDtoSrc, accountDtoDest, inputMap).get("sourse_acc_id");
  }
}
