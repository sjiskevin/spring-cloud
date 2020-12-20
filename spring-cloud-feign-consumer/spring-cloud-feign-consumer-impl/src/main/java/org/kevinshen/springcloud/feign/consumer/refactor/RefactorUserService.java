package org.kevinshen.springcloud.feign.consumer.refactor;

import org.kevinshen.springcloud.feign.product.api.UserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
@FeignClient(value = "feign-product-impl")
public interface RefactorUserService extends UserService {
}
