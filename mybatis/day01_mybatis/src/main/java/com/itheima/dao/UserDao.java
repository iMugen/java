package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * 持久层dao
 *
 * @author Gakki
 * @date 2018/12/11 - 20:54
 */
public interface UserDao {

    /**
     * 查询所有
     *
     * @return
     */
    List<User> findAll();
}
