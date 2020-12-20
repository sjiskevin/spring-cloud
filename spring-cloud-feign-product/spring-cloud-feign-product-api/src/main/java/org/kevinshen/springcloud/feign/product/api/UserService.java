package org.kevinshen.springcloud.feign.product.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/user")
public interface UserService {

    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    public String getUserName();

    @RequestMapping(value = "/getUserCompany", method = RequestMethod.GET)
    public String getUserCompany();
}
