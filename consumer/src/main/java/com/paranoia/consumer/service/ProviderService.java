package com.paranoia.consumer.service;

import com.paranoia.hello.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author ZHANGKAI
 * @date 2019/5/23
 * @description
 */
@FeignClient(name = "service-provider")
public interface ProviderService extends HelloService {

}
