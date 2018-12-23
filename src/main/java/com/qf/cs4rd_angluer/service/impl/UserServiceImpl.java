package com.qf.cs4rd_angluer.service.impl;

import com.qf.cs4rd_angluer.entity.City;
import com.qf.cs4rd_angluer.entity.CityExample;
import com.qf.cs4rd_angluer.entity.Province;
import com.qf.cs4rd_angluer.entity.User;
import com.qf.cs4rd_angluer.mapper.CityMapper;
import com.qf.cs4rd_angluer.mapper.ProvinceMapper;
import com.qf.cs4rd_angluer.mapper.UserMapper;
import com.qf.cs4rd_angluer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserServiceImpl implements UserService {

    @Autowired
    private ProvinceMapper provinceMapper;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Province> findAllPro() {
        return provinceMapper.selectByExample(null);
    }

    @Override
    public List<City> findCitysByPid(Integer pid) {
        CityExample example = new CityExample();
        example.createCriteria().andPidEqualTo(pid);
        return cityMapper.selectByExample(example);
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }
}
