package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;

import java.util.List;

/**
 * @author Gakki
 * @date 2018/12/20 - 11:10
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void deleteAccount(Integer accountId) {
        accountDao.deleteAccount(accountId);
    }

    @Override
    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }
}
