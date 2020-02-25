package com.itheima.dao;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @author Gakki
 * @date 2018/12/20 - 11:12
 */
public interface AccountDao {

    List<Account> findAll();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void deleteAccount(Integer accountId);

    void updateAccount(Account account);

}
