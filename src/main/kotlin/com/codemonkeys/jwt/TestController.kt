package com.codemonkeys.jwt

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController() {

    @RequestMapping("/anonymous")
    @ResponseBody
    fun anonymous(): String {
        return "anonymous"
    }


    @RequestMapping("/secured")
    @ResponseBody
    fun secured(): String {
        return "secured"
    }

}
