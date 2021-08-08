package com.demo.banking.services;

import com.demo.banking.dto.ClientDto;
import com.demo.banking.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class EntityConverter {

  public Client convertDtoToClient(ClientDto clientDto) {
    Client client = new Client();
    client.setId(clientDto.getId());
    client.setFirstName(clientDto.getFirstName());
    client.setLastName(clientDto.getLastName());
    return client;
  }

  public ClientDto convertClientToDto(Client client) {
    ClientDto clientDto = new ClientDto();
    clientDto.setId(client.getId());
    clientDto.setFirstName(client.getFirstName());
    clientDto.setLastName(client.getLastName());
    return clientDto;
  }

}
