package com.test.dao;

import com.test.AccountT;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Daniel Liu 2020/2/27 8:04
 */
public interface IAccountDaoT {
    List<AccountT> findAll();
}
