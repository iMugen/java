package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.User;

import java.util.List;

/**
 * 用户的持久层接口
 *
 * @author Gakki
 * @date 2018/12/13 - 14:52
 */
public interface UserDao {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> findAll();

    /**
     * 根据用户id查询账户信息
     *
     * @return
     */
    List<Account> findAccountByUid(Integer uid);

}
