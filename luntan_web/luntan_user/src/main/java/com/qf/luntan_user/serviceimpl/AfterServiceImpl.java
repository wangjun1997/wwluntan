package com.qf.luntan_user.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.entity.Admin;
import com.qf.luntan_user.mapper.AfterMapper;
import com.qf.service.IAfterService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AfterServiceImpl implements IAfterService {

    @Autowired
    private AfterMapper afterMapper;

    @Override
    public Admin getLogin(Admin admin) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("adminName",admin.getAdminname());
        queryWrapper.eq("adminPassword",admin.getAdminpassword());
        Admin admin1 = afterMapper.selectOne(queryWrapper);
        return admin1;
    }
}
