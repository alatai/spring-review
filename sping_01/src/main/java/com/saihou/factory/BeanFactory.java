package com.saihou.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 一个创建Bean对象的工厂
 * Bean，在计算机英语中，有可重用组件的含义
 * JavaBea，JavaBean ！= 实体类，即用Java语言编写的可重用组件
 * <p>
 * 1）需要一个配置文件来配置service和dao（配置的内容：唯一标识=全限定类名（key=value）)
 * 2）通过读取配置文件中配置的内容，反射创建对象
 * 配置文件可以是xml，也可以是properties
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 22:11
 */
public class BeanFactory {

    // 定义properties对象
    private static Properties props;

    // 定义一个Map，用于存放要创建的对象，称之为容器
    private static Map<String, Object> beans;

    // 使用静态代码块为properties对象赋值
    static {
        try {
            // 实例化对象
            props = new Properties();
            // 获取properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            // 实例化容器
            beans = new HashMap<>();
            // 取出配置文件中所有的key
            Enumeration<Object> keys = props.keys();
            // 遍历枚举
            while (keys.hasMoreElements()) {
                String key = keys.nextElement().toString();
                // 根据key获取value
                String beanPath = props.getProperty(key);
                // 反射创建对象
                Object value = Class.forName(beanPath).getDeclaredConstructor().newInstance();
                // 存入容器
                beans.put(key, value);
            }
        } catch (Exception exp) {
            throw new ExceptionInInitializerError("初始化失败...");
        }
    }

    /**
     * 根据bean名称获取bean对象
     */
    public static Object getBean(String beanName) {
        return beans.get(beanName);
    }

    public static Object getBean2(String beanName) {
        Object bean = null;

        try {
            String beanPath = props.getProperty(beanName);
            bean = Class.forName(beanPath).getDeclaredConstructor().newInstance();
        } catch (Exception exp) {
            exp.printStackTrace();
        }

        return bean;
    }
}
