package com.saihou.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类，提供了公共代码¬
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 15:58
 */
@Component("logger")
@Aspect // 表示当前类是一个切面
public class Logger {

    @Pointcut("execution(* com.saihou.service.*Service.*(..))")
    private void ptc(){};

    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行（切入点方法就是业务层方法)
     */
    @Before("ptc()")
    public void printLog() {
        System.out.println("开始记录日志...");
    }

    @After("ptc()")
    public void over(){
        System.out.println("记录结束...");
    }

}
