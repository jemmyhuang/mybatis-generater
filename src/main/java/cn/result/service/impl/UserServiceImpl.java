package cn.result.service.impl;

import base.BaseServiceImpl;
import cn.result.dao.mapper.UserMapper;
import cn.result.dao.model.User;
import cn.result.dao.model.UserExample;
import cn.result.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserService实现
* Created by jiehuang on 2018/1/26.
*/
@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User, UserExample> implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserMapper userMapper;

}