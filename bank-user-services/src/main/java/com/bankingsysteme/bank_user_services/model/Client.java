package com.bankingsysteme.bank_user_services.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;



@Data
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    
    private int id;
    private String name;
    private String surname;
    private String cni;
    private String email;
    private String phone;
    private String password;


}
