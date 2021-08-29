package com.kiheyunkim.actuator.test.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * IDE : IntelliJ IDEA
 * Created by kiheyunkim@gmail.com on 2021-08-29
 * GitHub : http://github.com/kiheyunkim
 * Comment :
 */
@RestController
@RequestMapping("/")
class TestController {
	@GetMapping("/test")
	fun getTest(): String {
		return "testController Get /Test"
	}
}
