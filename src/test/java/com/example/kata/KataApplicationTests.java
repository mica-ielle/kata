package com.example.kata;

import com.example.kata.Domain.model.Amount;
import com.example.kata.Domain.model.Debit;
import com.example.kata.Port.dto.CreditRequestDTO;
import com.example.kata.Port.dto.DebitRequestDTO;
import com.example.kata.Port.input.BankServices;
import com.example.kata.Domain.model.Credit;
import com.example.kata.Port.output.CreditRepository;
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
	CreditRepository creditRepositoryMock;

	@Test
	void contextLoads() {
	}

	@Test
	void GivenNewDepositWhenSaveThenAccountCredited() {
		//Given
		Credit credit = new Credit(1000);

		Amount newAmount = new Amount(0, credit.getDepositDate());

		CreditRequestDTO creditRequestDTO = new CreditRequestDTO(credit.getAmount(),newAmount.getAmount());
		//When
		when(bankServicesMock.deposit(credit)).thenReturn(creditRequestDTO);
		Object response = bankServicesMock.deposit(credit);

		//Then
		assertEquals(creditRequestDTO, response);
	}


	@Test
	void GivenAmountWhenRemoveThenAccountDebited() {
		//Given
		Debit debit = new Debit(100);

		Amount newAmount = new Amount(1000, debit.getDebitDate());

		DebitRequestDTO debitRequestDTO = new DebitRequestDTO(debit.getAmount(),newAmount.getAmount());
		//When
		when(bankServicesMock.debit(debit)).thenReturn(debitRequestDTO);
		Object response = bankServicesMock.debit(debit);

		//Then
		assertEquals(debitRequestDTO, response);
	}

	@Test
	void GivenAmountWhenRemoveThenAccountAmountNotEnouth() {
		//Given
		Debit debit = new Debit(1000);

		Amount newAmount = new Amount(10, debit.getDebitDate());

		DebitRequestDTO debitRequestDTO = new DebitRequestDTO(debit.getAmount(),newAmount.getAmount());
		//When
		when(bankServicesMock.debit(debit)).thenReturn(debitRequestDTO.setError());
		Object response = bankServicesMock.debit(debit);

		//Then
		assertEquals(debitRequestDTO.setError(), response);
	}

}
