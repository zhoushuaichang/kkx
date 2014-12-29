package com.shinowit.web;

import com.shinowit.dao.mapper.WebUserMapper;
import com.shinowit.entity.WebUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/26.
 */
@Controller
@RequestMapping(value = "/reg")
public class RegController {

    @Resource
    private WebUserMapper web_user_dao;

    @RequestMapping(value = "/reg")
    public String reg(@ModelAttribute(value = "webUser")WebUser webUser) {

        return "reg";
    }

    @RequestMapping(value = "/insert")
    public String insert(@ModelAttribute(value = "webUser")WebUser webUser,String RexPassWord,String Validate_Code,HttpServletRequest request){
        if(!webUser.getUserPass().equals(RexPassWord)){
            return "/reg";
        }
        String rand=(String)request.getSession().getAttribute("rand");
        if(!Validate_Code.equals(rand)){
            return "/reg";
        }

        try{
            web_user_dao.insert(webUser);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "/login/login";
    }

}
