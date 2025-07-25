package com.example.BankApp.Service;

//import com.example.BankApp.Entity.Account;
import com.example.BankApp.dto.AccountDto;
import java.util.List;

public interface AccountService
{
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long id);
    AccountDto deposit(long id,double amount);
    AccountDto withdraw(long id,double amount);

    List<AccountDto>getAllAccounts();
    void deleteAccount(Long id);

}
