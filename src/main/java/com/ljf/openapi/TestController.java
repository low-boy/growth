package com.ljf.openapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: ljf
 * @Date: 2021/06/11/10:42
 * @Description:
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("getTest")
    public String test(){
        return "???";
    }
}
