package com.saihou.factory;

import com.saihou.service.UserService;
import com.saihou.service.impl.UserServiceImpl;

/**
 * @author Alatai
 * @version 1.0
 * @date 2021/04/15 23:58
 */
public class InstanceFactory {

    public UserService getUserService() {
        return new UserServiceImpl();
    }

}
