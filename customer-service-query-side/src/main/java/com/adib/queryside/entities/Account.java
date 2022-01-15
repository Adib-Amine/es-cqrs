package com.adib.queryside.entities;

import com.adib.coreapi.enums.AccountStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import lombok.AllArgsConstructor;
@Entity

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    @Id
    private String id;
    private double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;

    @OneToMany(mappedBy = "account", cascade = CascadeType.PERSIST)
    private Collection<Operation> operations;

}
