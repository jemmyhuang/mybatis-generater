package cn.result.service;

import base.BaseServiceMock;
import cn.result.dao.mapper.UserMapper;
import cn.result.dao.model.User;
import cn.result.dao.model.UserExample;

/**
* 降级实现UserService接口
* Created by jiehuang on 2018/1/26.
*/
public class UserServiceMock extends BaseServiceMock<UserMapper, User, UserExample> implements UserService {

}
