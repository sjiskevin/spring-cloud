package org.kevinshen.springcloud.feign.product.impl;

import org.kevinshen.springcloud.feign.product.api.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName() {
        return "kevinshen";
    }

    @Override
    public String getUserCompany() {
        return "lx";
    }
}
