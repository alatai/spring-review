package com.saihou.exceptioin;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 异常处理器
 *
 * @author Alatai
 * @version 1.0
 * @date 2021/04/17 17:11
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 处理异常逻辑
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception exp) {
        // 获取到异常对象
        SysException sysExp = null;
        if (exp instanceof SysException) {
            sysExp = (SysException) exp;
        } else {
            sysExp = new SysException("系统正在维护");
        }

        // 创建ModelAndView
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", sysExp.getMessage());
        mv.setViewName("error");

        return mv;
    }
}
