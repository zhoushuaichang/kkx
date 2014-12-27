package com.shinowit.web;

import com.shinowit.entity.WebUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2014/12/26.
 */
@Controller
@RequestMapping(value = "/")
public class RegController {

    @RequestMapping(value = "/reg")
    public String reg(@ModelAttribute(value = "webUser")WebUser webUser) {

        return "reg";
    }

}
