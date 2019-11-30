package com.qf.luntan_user.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    public User login(User user) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username", user.getUsername());
        queryWrapper.eq("userpassword",user.getUserpassword());
        User us = userMapper.selectOne(queryWrapper);
        return us;
    }

    @Override
    public int changeInfo(User user) {

        return  userMapper.updateInfo(user);
    }

    @Override
    public User selectById(Integer uid) {
        return userMapper.selectById(uid);
    }


    /*后端查询所有用户的方法*/
    @Override
    public List<User> userlist() {
        return userMapper.selectList(null);
    }

    /*后端查询单个用户用于修改的方法*/
    @Override
    public User getUserById(Integer id) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uID",id);
        User user = userMapper.selectOne(queryWrapper);
        return user;
    }

    /*修改用户的提交方法*/
    @Override
    public int getUser(User user) {
       return userMapper.updateuser(user);

    }
}
