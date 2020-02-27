package com.test.service;

import com.itheima.dao.IAccountDao;
import com.test.AccountT;
import com.test.dao.IAccountDaoT;
import com.test.dao.impl.AccountDaoTImpl;

import java.util.List;

/**
 * @author Daniel Liu 2020/2/27 8:01
 */
public class AccountServiceTImpl implements IAccountServiceT {
    private IAccountDaoT accountDaoT;

    public void setAccountDaoT(IAccountDaoT accountDaoT) {
        this.accountDaoT = accountDaoT;
    }

    @Override
    public List<AccountT> findAll() {
        return accountDaoT.findAll();
    }
}