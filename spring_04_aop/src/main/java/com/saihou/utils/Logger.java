package com.saihou.utils;

/**
 * 用于记录日志的工具类，提供了公共代码¬
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 15:58
 */
public class Logger {

    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行（切入点方法就是业务层方法)
     */
    public void printLog() {
        System.out.println("开始记录日志...");
    }

    public void over(){
        System.out.println("记录结束...");
    }

}
