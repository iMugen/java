package com.imugen.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

/**
 * @author Gakki
 * @date 2018/12/23 - 20:02
 */
@Controller
class ttt {
    @RequestMapping(path = ["/hello"])
    fun sayHello(map: MutableMap<String?, Any?>): String {
        println("111")
        map["age"] = "18"
        return "success"
    }

    @get:GetMapping("/num")
    val num: Int
        get() = 3000
}