package com.imugen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Gakki
 * @date 2018/12/23 - 20:02
 */
@Controller
public class HelloController {

    @RequestMapping( path = "/hello" )
    public String sayHello() {
        System.out.println("111222");
        return "success";
    }
}
