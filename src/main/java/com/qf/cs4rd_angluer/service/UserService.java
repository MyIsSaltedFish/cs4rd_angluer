package com.qf.cs4rd_angluer.service;

import com.qf.cs4rd_angluer.entity.City;
import com.qf.cs4rd_angluer.entity.Province;
import com.qf.cs4rd_angluer.entity.User;

import java.util.List;

public interface UserService {
    List<Province> findAllPro();
    List<City> findCitysByPid(Integer pid);
    void addUser(User user);
}
