package com.demo.banking.dto_service;

import com.demo.banking.dao_entity.Account;
import com.demo.banking.dto_entity.AccountDto;
import com.demo.banking.dto_entity.ClientDto;
import com.demo.banking.dao_entity.Client;
import com.demo.banking.exception.MyException;
import com.demo.banking.fasade.EntityConverter;
import com.demo.banking.dao_service.ClientServices;
import java.util.Map;
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
    Client clientUpdt = clientServices.updateAcc(clientCrtd, converter.convertListAccountDtoToListAccount(clientDto.getListAccounts()));
    return converter.convertClientToDto(clientUpdt);
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

  @Override
  public Integer payment(AccountDto accountDto, Map<String, String> inputMap) {
    Account account = converter.;
        converter.
    return null;
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
