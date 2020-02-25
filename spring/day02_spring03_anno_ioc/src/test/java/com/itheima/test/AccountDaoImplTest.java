package com.itheima.test;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Gakki
 * @date 2018/12/20 - 11:43
 */
public class AccountDaoImplTest {
    private ApplicationContext ac;
    private AccountService as;

    @Before
    public void setUp() throws Exception {
        //1.获取容器
        ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.得到业务层对象
        as = ac.getBean("accountService", AccountService.class);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void setRunner() {
    }

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