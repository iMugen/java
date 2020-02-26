package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author Gakki
 * @date 2018/12/20 - 11:43
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = SpringConfiguration.class )
public class AccountDaoImplTest1 {

    @Autowired
    private AccountService as;


    @Test
    public void findAll() {
        //3.执行方法
        List<Account> accounts = as.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void findAccountById() {
        System.out.println(as.findAccountById(1));
    }

    @Test
    public void saveAccount() {
        Account account = new Account();
        account.setName("Jin");
        account.setMoney(124);

        as.saveAccount(account);
    }

    @Test
    public void deleteAccount() {
        as.deleteAccount(4);
    }

    @Test
    public void updateAccount() {
        Account account = as.findAccountById(5);
        account.setMoney(125);

        as.updateAccount(account);
    }
}