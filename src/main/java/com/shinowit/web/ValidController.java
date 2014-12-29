package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/")
public class ValidController {
    @RequestMapping(value = "/validCode")
    public String valid(){
        return "validCode";
    }
}
