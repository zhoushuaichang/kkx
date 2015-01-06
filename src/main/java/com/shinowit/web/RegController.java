package com.shinowit.web;

import com.shinowit.dao.mapper.WebUserMapper;
import com.shinowit.entity.WebUser;
import com.shinowit.tools.HtmlMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.sql.Date;

/**
 * Created by Administrator on 2014/12/26.
 */
@Controller
@RequestMapping(value = "/reg")
public class RegController {

    @Resource
    private
    WebUserMapper web_user_dao;
    @Resource
    private HtmlMail htmlMail;

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
        java.util.Date d=new java.util.Date();
        webUser.setRegDate(new Date(d.getTime()));
        String sessionId=request.getSession().getId();
        webUser.setRemark(sessionId);
        String messageText="<a href='http://localhost:8080/active/"+webUser.getEmail()+"/"+sessionId+"' target='_blank'>点此激活</a>,如不能激活，请复制链接地址\"http://localhost:8080/active/"+webUser.getEmail()+"/"+sessionId+"\"到新标签页直接输入！";

        try{
            web_user_dao.insert(webUser);
            htmlMail.sendMessage(webUser.getEmail(),"激活邮件",messageText);

        }catch (Exception e){
            e.printStackTrace();
        }
        return "/login";
    }

}
