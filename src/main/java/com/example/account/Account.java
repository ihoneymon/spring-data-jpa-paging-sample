package com.example.account;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Account implements Serializable {
    private static final long serialVersionUID = -4685784179651157036L;

    @Id
    @GeneratedValue
    private Long id;
    
    private String username;
    
    private String password;
}
