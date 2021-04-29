package com.example.demo;

import java.util.*;
import javax.persistence.*;


@Entity
@Table(name = "users")
public class StarbucksCard {
    private int id;
    private String cardNumber;
    private String cardCode;
    private double balance;
    private boolean activated;
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public StarbucksCard() {

    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isActivated() {
        return this.activated;
    }

    public boolean getActivated() {
        return this.activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}