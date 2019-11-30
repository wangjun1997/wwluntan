package com.qf.luntan_user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.entity.User;

/**
 * @author wangjun
 * @name wwluntan
 * @time 2019/11/29 23:31
 */
public interface UserMapper extends BaseMapper<User> {

    int updateuser(User user);
}
