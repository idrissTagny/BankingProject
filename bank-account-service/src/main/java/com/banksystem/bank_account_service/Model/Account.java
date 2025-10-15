package com.banksystem.bank_account_service.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String accountNumber;
    private Double balance = 0.0;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private Bank bank;
}
