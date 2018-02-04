package com.jbit.service;

import com.jbit.entity.Users;

public interface UsersService {
    Users getLogin( String name, String password);
}
