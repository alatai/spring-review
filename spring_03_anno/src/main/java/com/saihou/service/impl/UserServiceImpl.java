package com.saihou.service.impl;

import com.saihou.dao.UserDao;
import com.saihou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * 业务层实现类
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:05
 *
 * 曾经的XML配置
 * <bean id="userService" class="com.saihou.service.impl.UserServiceImpl"
 * scope="singleton" init-method="init" destroy-method="destroy"></bean>
 *
 * 用于创建对象的
 *    作用就和在XML配置文件编写一个<bean>标签实现的功能是一样的
 *    Component：
 *       作用：用于吧当前类对象存入Spring容器中
 *       属性：value用于指定bean的id，当不写时，默认值是当前类名，且首字母小写
 *    Controller（表现层）、Service（业务层)、Repository（持久层）
 *       以上三个注解他们的作用和属性与Component是一样的，是Spring框架提供明确的三层使用注解
 * 用于注入数据的
 *    作用就和在XML配置文件中的bean标签中写一个<property>标签的作用是一样的
 *    Autowire：
 *       作用：自动按照类型注入，只要容器中有唯一的bean对象类型和要注入的变量类型匹配就可以注入成功
 *            如果IoC容器中没有任何bean的类型和要注入的变量类型匹配，则报错
 *            如果IoC容器中有多个匹配类型时，会按照名称查找
 *       出现位置：可以是变量上，也可以是方法上
 *       细节：在使用注解注入时，set方法就不是必须的了
 *    Qualifier：
 *       作用：在按照勒种注入的基础之上再按照名称注入，给类成员注入时不能单独使用。但是给方法参数注入时可以
 *       属性：value用于指定注入bean的id
 *    Resource（JaveEE（Java8以前）中的注解：javax.annotation.Resource):
 *       作用：直接按照bean的id注入，可以独立使用
 *       属性：name用于指定bean的id
 *    以上三个注解都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述中注解实现
 *    另外，集合类型的注入只能通过XML来实现
 *
 *    Value：
 *       作用：用于注入基本类型和String类型的数据
 *       属性：value用于指定数据的值，可以使用Spring中的SpEL（Spring的EL表达式）
 *            SpEL的写法，$(表达式)
 * 用于改变作用范围的
 *    作用就和XML配置文件中使用scope属性实现的功能是一样的
 *    Scope：
 *       作用：用于指定bean的作用范围
 *       属性：value指定范围的取值，常用singleton，prototype
 * 和生命周期相关
 *    作用就和在bean标签中使用init-method和destroy-method的作用一样的
 *    PreDestroy：
 *       作用：用于指定销毁方法
 *    PostConstruct：
 *       作用：用于指定初始化方法
 */
// @Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    // @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }

    public void init() {
        System.out.println("init");
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
