package com.tahrioussama.bankaccount.services;

import com.tahrioussama.bankaccount.dto.BankAccountRequestDTO;
import com.tahrioussama.bankaccount.dto.BankAccountResponseDTO;

public interface IAccountService {

     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO);

    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountRequestDTO);
}
