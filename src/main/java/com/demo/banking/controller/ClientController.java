package com.demo.banking.controller;

import com.demo.banking.dto_entity.ClientDto;
import com.demo.banking.exception.MyException;
import com.demo.banking.dto_service.ClientDtoService;
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
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

  private final ClientDtoService clientDtoService;

  @PostMapping("/save")
  public ClientDto createClient(@RequestBody ClientDto clientDto) throws MyException {
    log.info("New client created: " + clientDto);
    return clientDtoService.create(clientDto);
  }

  @PostMapping("/saveAll")
  public ClientDto createAll(@RequestBody ClientDto clientDto) throws MyException {
    log.info("New client created: " + clientDto);
    return clientDtoService.create(clientDto);
  }


  @GetMapping("/findById")
  public ClientDto findById(@RequestParam Integer id) {
    log.info("Client found by ID: " + id);
    return clientDtoService.findById(id);
  }
}
