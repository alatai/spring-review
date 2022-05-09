package com.saihou.ui;

import com.saihou.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:11
 */
public class Client {

    /**
     * 获取Spring的核心容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类
     * ClassPathXmlApplicationContext：加载类路径下的配置文件，要求配置文件必须在类路径下，不在的话，加载不了
     * FileSystemXmlApplicationContext：加载磁盘任意路径下的配置文件（必须有访问权限)
     * AnnotationConfigApplicationContext：读取注解创建容器
     *
     * 核心容器的两个接口
     * ApplicationContext（单例对象适用)：构建核心容器时，创建对象采取的策略是采用立即加载的方式，只要一读取完配置文件马上就创建配置文件中的对象
     * BeanFactory（多例对象适用)：构建核心容器时，创建对象采取的策略是采用延迟加载的方式，根据id获取对象时才真正获取对象
     */
    public static void main(String[] args) {
        // 1.获取核心对象容器
        // ApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springConfig.xml");
        // 2.根据id获取bean对象
        UserService userService = (UserService) ctx.getBean("userService");

        ctx.close();
    }
}
