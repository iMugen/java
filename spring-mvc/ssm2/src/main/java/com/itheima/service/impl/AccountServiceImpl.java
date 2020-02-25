package com.itheima.service.impl;

import com.itheima.beans.Account;
import com.itheima.mapper.AccountMapper;
import com.itheima.service.AccountService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mugen
 * @since 2018-12-28
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

}
