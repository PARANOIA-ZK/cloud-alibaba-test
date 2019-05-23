package com.paranoia.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZHANGKAI
 * @date 2019/5/23
 * @description
 */
@Slf4j
@RestController
public class ServiceController {


    @RequestMapping(value = "/service/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        log.info("server client get request msg :" + string);
        return "server callback : " + string;
    }

}
