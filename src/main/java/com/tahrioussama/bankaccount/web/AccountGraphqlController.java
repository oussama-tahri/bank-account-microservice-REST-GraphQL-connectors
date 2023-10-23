package com.tahrioussama.bankaccount.web;

import com.tahrioussama.bankaccount.dto.BankAccountRequestDTO;
import com.tahrioussama.bankaccount.dto.BankAccountResponseDTO;
import com.tahrioussama.bankaccount.entities.BankAccount;
import com.tahrioussama.bankaccount.entities.Customer;
import com.tahrioussama.bankaccount.repositories.BankAccountRepository;
import com.tahrioussama.bankaccount.repositories.CustomerRepository;
import com.tahrioussama.bankaccount.services.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class AccountGraphqlController {

    private BankAccountRepository repository;
    private IAccountService accountService;
    private CustomerRepository customerRepository;

    @QueryMapping
    public List<BankAccount> accountsList() {
        return repository.findAll();
    }

    @QueryMapping
    public BankAccount accountById(@Argument String id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("account %s not found", id)));
    }

    @MutationMapping
    public BankAccountResponseDTO addAccount(@Argument BankAccountRequestDTO bankAccount) {
        return accountService.addAccount(bankAccount);
    }

    @MutationMapping
    public BankAccountResponseDTO updateAccount(@Argument String id, @Argument BankAccountRequestDTO bankAccount) {
        return accountService.updateAccount(id, bankAccount);
    }

    @MutationMapping
    public boolean deleteAccount(@Argument String id) {
        repository.deleteById(id);
        return true;
    }

    @QueryMapping
    public List<Customer> customersList() {
        return customerRepository.findAll();
    }
}
