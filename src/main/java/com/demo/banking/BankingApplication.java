package com.demo.banking;

import com.demo.banking.entity.Account;
import com.demo.banking.entity.AccountType;
import com.demo.banking.entity.Client;
import com.demo.banking.services.AccountServices;
import com.demo.banking.services.ClientServices;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BankingApplication {

	@Autowired
	private ClientServices clientServices;

	@Autowired
	private AccountServices accountServices;


	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	private void test() {

		Client client1 = new Client();
		client1.setFirstName("Name1");
		client1.setLastName("Fam1");
		client1.setListAccounts(new ArrayList<>());

		Client client2 = new Client();
		client2.setFirstName("Name2");
		client2.setLastName("Fam2");

		Account account1 = new Account();
		account1.setAccountNum(123456789L);
		account1.setType(AccountType.CARD);
		account1.setBalance(5000.00);
		account1.setClient(client1);

		Account account11 = new Account();
		account11.setAccountNum(987654321L);
		account11.setType(AccountType.SIMPLE);
		account11.setBalance(10000.00);
		account11.setClient(client1);
//		System.out.println(account11);
//		System.out.println();

		Account account2 = new Account();
		account2.setAccountNum(555L);
		account2.setType(AccountType.CARD);
		account2.setBalance(15000.00);
		account2.setClient(client2);
//
//		List<Account> cl1 = new ArrayList<>();
//		cl1.add(account1);
//		cl1.add(account11);
//		List<Account> cl2 = new ArrayList<>();
//		cl2.add(account2);
//
//		client1.setListAccounts(cl1);
//		client2.setListAccounts(cl2);
//		System.out.println(client1);
//		System.out.println(account2);

		clientServices.create(client1);
		clientServices.create(client2);
//		System.out.println(client1);
//		System.out.println(clientServices.findById(1));

		accountServices.create(account1);
		accountServices.create(account11);
		accountServices.create(account2);

//		final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//		Session session = sessionFactory.openSession();
//		session.beginTransaction();


//		System.out.println(accountServices.findAllClientId(1));

////		accountServices.create(account1);
////		accountServices.create(account11);
////		accountServices.create(account2);
//
//
////		clientServices.findAll().forEach(System.out::println);
//
//
	}
}
