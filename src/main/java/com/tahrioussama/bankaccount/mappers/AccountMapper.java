package com.tahrioussama.bankaccount.mappers;

import com.tahrioussama.bankaccount.dto.BankAccountResponseDTO;
import com.tahrioussama.bankaccount.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    public BankAccountResponseDTO fromBankAccount(BankAccount account) {
        BankAccountResponseDTO responseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(account,responseDTO);
        return responseDTO;
    }
}
