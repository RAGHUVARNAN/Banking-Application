package com.example.BankApp.mapper;

import com.example.BankApp.Entity.Account;
import com.example.BankApp.dto.AccountDto;

public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto) {
    Account account=new Account(
            accountDto.getId(),
            accountDto.getAccountHolderName(),
            accountDto.getBalance()
    );
    return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
