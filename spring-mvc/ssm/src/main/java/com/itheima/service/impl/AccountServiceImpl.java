package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Gakki
 * @date 2018/12/26 - 18:02
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}
