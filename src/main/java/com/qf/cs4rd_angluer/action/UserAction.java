package com.qf.cs4rd_angluer.action;

import com.qf.cs4rd_angluer.entity.City;
import com.qf.cs4rd_angluer.entity.Province;
import com.qf.cs4rd_angluer.entity.User;
import com.qf.cs4rd_angluer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserAction {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/add")
//    @CrossOrigin(origins = "*")
    @ResponseBody
    public String addUser(@RequestBody User user){
        System.out.println(user+"sss");
        userService.addUser(user);
        return "add success";
    }

    @RequestMapping(value = "/user/findAllPro",method = RequestMethod.POST)
    @ResponseBody
    public List<Province> findAllProvince(){
         return  userService.findAllPro();
    }

    @RequestMapping("/user/findCitysByPid")
    @ResponseBody
    public List<City> findCitysByPid(Integer pid){
        return  userService.findCitysByPid(pid);
    }
}
