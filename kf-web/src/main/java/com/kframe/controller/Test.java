package com.kframe.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/9/8.
 */

@Controller
@RequestMapping(value = "/hello", method = RequestMethod.GET)
public class Test {

    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    @RequestMapping("/index")
    public String index(){
        logger.debug("--");
        return "index";
    }

}
