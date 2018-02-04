package com.jbit.service.impl;

import com.jbit.dao.UsersMapper;
import com.jbit.entity.Users;
import com.jbit.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/2/2.
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    public Users getLogin(String name, String password) {
        return usersMapper.getLogin(name,password);
    }
}
