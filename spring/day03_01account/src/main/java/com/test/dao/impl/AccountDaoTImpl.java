package com.test.dao.impl;

import com.test.AccountT;
import com.test.dao.IAccountDaoT;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Daniel Liu 2020/2/27 8:04
 */
public class AccountDaoTImpl implements IAccountDaoT {
    private QueryRunner runner;

    public void setRunner(QueryRunner runner) {
        this.runner = runner;
    }

    @Override
    public List<AccountT> findAll() {
        try {
            return runner.query("select * from account", new BeanListHandler<>(AccountT.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}