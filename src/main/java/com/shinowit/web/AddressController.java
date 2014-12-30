package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/30.
 */
@Controller
@RequestMapping("/")
public class AddressController {

    @RequestMapping(value = "/address")
    public String address(){

        return "address";
    }

}
