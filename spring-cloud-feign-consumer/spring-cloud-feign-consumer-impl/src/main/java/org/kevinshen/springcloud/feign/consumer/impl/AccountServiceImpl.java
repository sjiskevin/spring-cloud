package org.kevinshen.springcloud.feign.consumer.impl;

import org.kevinshen.springcloud.feign.consumer.api.AccountService;
import org.kevinshen.springcloud.feign.consumer.refactor.RefactorUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountServiceImpl implements AccountService {

    @Autowired
    private RefactorUserService refactorUserService;

    @Override
    public String getAccountBook() {
        return refactorUserService.getUserName();
    }
}
