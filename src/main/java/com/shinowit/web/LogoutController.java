package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/28.
 */
@Controller
@RequestMapping("/logout")
public class LogoutController {
    @Resource
    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        try{
            session.invalidate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return "redirect:/base";
        }
    }

}
