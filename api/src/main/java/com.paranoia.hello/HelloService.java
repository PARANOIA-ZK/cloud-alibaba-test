package com.paranoia.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ZHANGKAI
 * @date 2019/5/23
 * @description
 */
public interface HelloService {

    @RequestMapping(value = "/service", method = RequestMethod.GET)
    String echo(@RequestParam(value = "name") String name);

//    @RequestMapping(value = "/service/mono-str", method = RequestMethod.GET)
//    Mono getMonoString();
}
