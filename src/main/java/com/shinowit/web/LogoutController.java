package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/28.
 */
@Controller
@RequestMapping("/")
public class LogoutController {

    @Resource
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        try {
            if(session.getAttribute("current_user")!=null){
                session.removeAttribute("current_user");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "redirect:/base";
    }

}
