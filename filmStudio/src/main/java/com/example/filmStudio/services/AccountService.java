package com.example.filmStudio.services;


import com.example.filmStudio.models.Account;
import com.example.filmStudio.models.Author;
import com.example.filmStudio.models.Film;
import com.example.filmStudio.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;

    public List<Account> list() {
        return accountRepository.findAllAccounts();
    }

    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }
    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public void createAccount(Account account){
        accountRepository.createAccount(account.getNickname(), account.getAvatar(), account.getAccess_level(), account.getUser_record_id(), account.getCart_id());
    }
}
