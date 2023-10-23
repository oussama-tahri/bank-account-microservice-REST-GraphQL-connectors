package com.tahrioussama.bankaccount.entities;


import com.tahrioussama.bankaccount.enums.AccountType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data @Builder
public class BankAccount {
    @Id
    private String id;
    private Date createAt;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    @ManyToOne
    private Customer customer;
}
