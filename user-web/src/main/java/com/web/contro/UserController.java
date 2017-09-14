package com.web.contro;

import com.api.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import utils.FactoryBeanUtils;

/**
 * 用户管理
 *
 * @author shuaion 2017/9/12
 **/
@Controller
@RequestMapping("/web")
public class UserController {

    @RequestMapping("/say")
    @ResponseBody
    public String say(){
        IUserService userService = (IUserService) FactoryBeanUtils.getBean("userService");
        String say = userService.sayHello("here is user-web");
        System.out.println("user-web:"+say);
        return say;
    }

}
