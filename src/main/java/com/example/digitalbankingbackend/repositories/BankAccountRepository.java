package com.example.digitalbankingbackend.repositories;

import com.example.digitalbankingbackend.entities.BankAccount;
import com.example.digitalbankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
