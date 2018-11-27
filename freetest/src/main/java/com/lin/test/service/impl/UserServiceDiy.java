package com.lin.test.service.impl;

import com.lin.test.entity.User;
import com.lin.test.dao.UserDao;
import com.lin.test.service.MPUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author baozang
 * @since 2018-11-06
 */
@Service
public class UserServiceDiy extends ServiceImpl<UserDao, User> implements MPUserService {

}
