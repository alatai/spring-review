package com.saihou.factory;

import com.saihou.service.UserService;
import com.saihou.service.impl.UserServiceImpl;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/16 0:04
 */
public class StaticFactory {

    public static UserService getUserService() {
        return new UserServiceImpl();
    }
}
