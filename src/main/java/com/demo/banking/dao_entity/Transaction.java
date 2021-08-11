package com.demo.banking.dao_entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "account")
@NoArgsConstructor
public class Transaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private Integer id;

  @Column(name = "source_acc")
  String sourceAcc;

  @Column(name = "dest_acc")
  String destAcc;

  @Column(name = "amount")
  Double amount;

  @Column(name = "reason")
  String reason;

  @Column(name = "date")
  Date date;
}
