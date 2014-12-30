package com.shinowit.web;

import com.shinowit.dao.mapper.WebUserMapper;
import com.shinowit.entity.WebUser;
import com.shinowit.entity.WebUserCriteria;
import com.shinowit.tools.Email;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2014/12/27.
 */
@Controller
@RequestMapping(value = "/getPwd")
public class GetPasswordController {

    @Resource
    private Email email;
    @Resource
    private WebUserMapper web_user_dao;

    @RequestMapping("/getPass1")
    public String getPass1(){
        return "GetPwd1";
    }

    @RequestMapping("/sendEmail")
    public String sendEmail(String email_address,Model model){
        WebUserCriteria ex=new WebUserCriteria();
        WebUserCriteria.Criteria criteria=ex.createCriteria();
        criteria.andEmailEqualTo(email_address);
        List<WebUser> webUserList=web_user_dao.selectByExample(ex);
        if(webUserList.size()>0){
            WebUser webUser=webUserList.get(0);
            String email_title="密码修改邮件";
            String email_content="您的密码是:"+webUser.getUserPass()+"，请谨慎保管!";
            email.sendMail(email_title,email_content,email_address);
            model.addAttribute("messageTip","我们已经把密码邮件发送至您的邮箱，请注意查收。");
            return "GetPwd2";
        }else{
            model.addAttribute("messageTip","邮件发送失败,邮箱没有注册，请确认。");
            return "GetPwd1";
        }

    }


}
