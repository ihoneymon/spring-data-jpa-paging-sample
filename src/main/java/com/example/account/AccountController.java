package com.example.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;
    
    @RequestMapping("/accounts")
    public Page<Account> search(Pageable pageable) {
        return accountService.findAll(pageable);
    }
}
