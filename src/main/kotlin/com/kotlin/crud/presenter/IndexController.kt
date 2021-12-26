package com.kotlin.crud.presenter

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {
    @RequestMapping("/")
    fun index(): String {
        return "Index page"
    }
}