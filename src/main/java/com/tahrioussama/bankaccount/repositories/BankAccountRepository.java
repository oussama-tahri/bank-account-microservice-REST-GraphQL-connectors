package com.tahrioussama.bankaccount.repositories;

import com.tahrioussama.bankaccount.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
