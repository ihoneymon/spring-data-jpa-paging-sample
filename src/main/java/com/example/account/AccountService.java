package com.example.account;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccountService {

    Page<Account> findAll(Pageable pageable);
}
