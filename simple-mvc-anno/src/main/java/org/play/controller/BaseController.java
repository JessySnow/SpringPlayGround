package org.play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("base.do")
public class BaseController {
    // 两个不同请求方式，返回不同的对象
    @RequestMapping(method = RequestMethod.GET)
    public String testGET(){
        return "testGET";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String testPOST(){
        return "testPOST";
    }
}
