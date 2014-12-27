package com.shinowit.web;

import com.shinowit.dao.mapper.WebUserMapper;
import com.shinowit.entity.WebUser;
import com.shinowit.entity.WebUserCriteria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by Administrator on 2014/12/26.
 */
@Controller
@RequestMapping(value = "/")
public class LoginController {

    @Resource
    private WebUserMapper web_user_dao;

    @RequestMapping(value="/login")
    public String login(@ModelAttribute(value = "webUser") WebUser webUser){
        return "login";
    }

    @RequestMapping(value="/checkLogin")
    public String checkLogin(@Valid @ModelAttribute(value = "webUser") WebUser webUser,BindingResult bindingResult,Model model){
        WebUserCriteria ex=new WebUserCriteria();
        WebUserCriteria.Criteria cr=ex.createCriteria();
        cr.andUserNameEqualTo(webUser.getUserName());
        cr.andUserPassEqualTo(webUser.getUserPass());

        List<WebUser> webUserList=web_user_dao.selectByExample(ex);
        if(webUserList.size()==0){
            model.addAttribute("loginError","登录名或密码错误！");
            return "login";
        }
        return "index";
    }

}
