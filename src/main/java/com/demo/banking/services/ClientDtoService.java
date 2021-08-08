package com.demo.banking.services;

import com.demo.banking.dto.ClientDto;
import com.demo.banking.entity.Client;
import com.demo.banking.exception.MyException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClientDtoService implements ClientDtoServiceImpl {

  private final EntityConverter converter;
  private final ClientServices clientServices;

  @Override
  public ClientDto create(ClientDto clientDto) throws MyException {
    validateClientDto(clientDto);
    Client clientCrtd = clientServices.create(converter.convertDtoToClient(clientDto));
    return converter.convertClientToDto(clientCrtd);
  }

  @Override
  public ClientDto findById(Integer id) {
    Client client = clientServices.findById(id);
    ClientDto clientDto = new ClientDto();
    if (client != null) {
      clientDto = converter.convertClientToDto(client);
    }
    return clientDto;
  }

  private void validateClientDto(ClientDto clientDto) throws MyException {
    if (clientDto == null) {
      throw new MyException("Object client is null");
    }
    if (clientDto.getFirstName().isEmpty()) {
      throw new MyException("Field name is empty");
    }
    if (clientDto.getLastName().isEmpty()) {
      throw new MyException("Field last name client is empty");
    }
  }

}
