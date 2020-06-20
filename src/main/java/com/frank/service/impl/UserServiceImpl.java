package com.frank.service.impl;

import com.frank.entity.User;
import com.frank.mapper.UserMapper;
import com.frank.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author frank
 * @since 2020-06-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
