package com.example.digitalbankingbackend.repositories;

import com.example.digitalbankingbackend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {

}
