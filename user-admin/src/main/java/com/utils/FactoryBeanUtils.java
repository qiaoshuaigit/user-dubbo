package com.utils;

import org.springframework.web.context.ContextLoader;

/**
 * 获取容器bean
 *
 * @author shuaion 2017/9/13
 **/
public class FactoryBeanUtils {


    public static Object getBean(String beanName) {

        Object bean = ContextLoader.getCurrentWebApplicationContext().getBean(beanName);

        return bean;
    }

}
