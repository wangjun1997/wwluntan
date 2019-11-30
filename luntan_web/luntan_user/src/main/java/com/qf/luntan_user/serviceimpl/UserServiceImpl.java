package com.qf.luntan_user.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.User;
import com.qf.luntan_user.mapper.UserMapper;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author wangjun
 * @name wwluntan
 * @time 2019/11/29 23:28
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer register(User user) {
        return userMapper.insert(user);
    }

    @Override
    public List<User> userlist() {
        return userMapper.selectList(null);
    }
}
