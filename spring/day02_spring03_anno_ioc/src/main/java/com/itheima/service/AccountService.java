package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author Gakki
 * @date 2018/12/20 - 11:01
 */
public interface AccountService {

    List<Account> findAll();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void deleteAccount(Integer accountId);

    void updateAccount(Account account);
}
