package com.example.kata;

import com.example.kata.Adapter.Repository.DepositRepository;
import com.example.kata.Domain.model.Deposit;
import com.example.kata.Domain.model.Services.BankServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class KataApplicationTests {

	@Mock
	BankServices bankServicesMock;
	@Mock
	DepositRepository depositRepositoryMock;

	@Test
	void contextLoads() {
	}

	@Test
	void GivenNewDepositWhenSaveThenAccountCredited() {
		//Given
		Deposit deposit = new Deposit("AcountNumber","ReceiverName",100,"DepositReason");

		//When
		when(depositRepositoryMock.save(deposit)).thenReturn(deposit);
		Object response = bankServicesMock.deposit(deposit);

		//Then
		assertEquals(deposit, response);
	}

}
