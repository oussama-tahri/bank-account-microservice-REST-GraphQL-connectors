package com.tahrioussama.bankaccount.repositories;

import com.tahrioussama.bankaccount.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
