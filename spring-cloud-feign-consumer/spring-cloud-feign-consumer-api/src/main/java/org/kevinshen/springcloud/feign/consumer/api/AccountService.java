package org.kevinshen.springcloud.feign.consumer.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "account")
public interface AccountService {

    @RequestMapping(value = "getAccountBook", method = RequestMethod.GET)
    public String getAccountBook();
}
