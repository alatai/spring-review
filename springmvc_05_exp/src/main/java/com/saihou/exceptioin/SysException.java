package com.saihou.exceptioin;

/**
 * 自定义异常类
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 17:07
 */
public class SysException extends Exception {

    // 存储提示信息
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
