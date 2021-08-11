package com.demo.banking.dto_entity;

import java.util.Date;
import lombok.Data;

@Data
public class TransactDto {

  private Integer id;
  String sourceAcc;
  String destAcc;
  Double amount;
  String reason;
  Date date;
}
