package com.admin.contro;

import com.api.IUserService;
import com.utils.FactoryBeanUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;

/**
 * 用户控制
 *
 * @author shuaion 2017/9/13
 **/
@RequestMapping("/user")
@Controller
public class UserController {

    @RequestMapping("/userSay")
    @ResponseBody
    public String userSay(){
        IUserService service = (IUserService)FactoryBeanUtils.getBean("userService");
        String say = service.sayHello("hello,here is user-admin");
        System.out.println("here="+say);
        return say;
    }


}
