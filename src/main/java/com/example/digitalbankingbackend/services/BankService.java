package com.example.digitalbankingbackend.services;

import com.example.digitalbankingbackend.entities.BankAccount;
import com.example.digitalbankingbackend.entities.CurrentAccount;
import com.example.digitalbankingbackend.entities.SavingAccount;
import com.example.digitalbankingbackend.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount=
                bankAccountRepository.findById("1b208d55-bd5c-4873-823c-def45f5bcdf3").orElse(null);
        if(bankAccount!=null){
            System.out.println("*****************************");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreatedAt());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if(bankAccount instanceof CurrentAccount){
                System.out.println("Rate =>"+((CurrentAccount)bankAccount).getOverDaft());
            }else if (bankAccount instanceof SavingAccount){
                System.out.println("Rate =>"+((SavingAccount)bankAccount).getInterestRate());
            }
            bankAccount.getAccountOperation().forEach(op->{
                System.out.println(op.getType()+"\t"+op.getOperationDate()+"\t"+op.getAmount());
            });
        }
    }
}
