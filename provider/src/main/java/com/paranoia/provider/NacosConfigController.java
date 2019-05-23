package com.paranoia.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZHANGKAI
 * @date 2019/5/23
 * @description
 */
@RestController
@RefreshScope
public class NacosConfigController {

    /***/
    @Value("${zk}")
    private String zk;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity index() {
        System.out.println("zk = " + zk);
        return new ResponseEntity("index error", HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
