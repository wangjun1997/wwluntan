package com.qf.service;

import com.qf.entity.User;

import java.util.List;

/**
 * 用户服务接口
 * @author wangjun
 * @name wwluntan
 * @time 2019/11/29 21:53
 */
public interface IUserService {
    Integer register(User user);

    List<User> userlist();
}
