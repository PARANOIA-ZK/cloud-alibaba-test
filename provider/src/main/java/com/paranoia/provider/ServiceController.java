package com.paranoia.provider;

import com.paranoia.hello.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZHANGKAI
 * @date 2019/5/23
 * @description
 */
@Slf4j
@RestController
public class ServiceController implements HelloService {


    @Override
    public String echo(String name) {
        log.info("server client get request msg :" + name);
        return "server callback : " + name;
    }

//    @Override
//    public Mono<String> getMonoString() {
//        return Mono.just("service client mono str : i am Iron Man");
//    }
}
