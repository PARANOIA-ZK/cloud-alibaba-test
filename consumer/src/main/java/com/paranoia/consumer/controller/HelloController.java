package com.paranoia.consumer.controller;

import com.paranoia.consumer.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZHANGKAI
 * @date 2019/5/23
 * @description
 */
@RestController
public class HelloController {

    @Autowired
    ProviderService providerService;

    @RequestMapping(value = "/consumer/{name}", method = RequestMethod.GET)
    public String echo(@PathVariable String name) {
        return providerService.echo(name);
    }

//    @RequestMapping(value = "/consumer/mono", method = RequestMethod.GET)
//    public Mono testMonoStr() {
//        return providerService.getMonoString();
//    }
}
