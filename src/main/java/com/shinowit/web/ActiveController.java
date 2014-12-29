package com.shinowit.web;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.Types;

/**
 * Created by Administrator on 2014/12/29.
 */
@Controller
@RequestMapping(value = "/")
public class ActiveController {
    @Resource
    private JdbcTemplate jt;

    @RequestMapping(value = "/active/{email}/{sessionId}")
    public String active(@PathVariable(value = "email") String email, @PathVariable(value = "sessionId") String sessionId) {
        String sql="update web_user set status='true',active_date=getdate() where email=? and remark=?";
        int result=jt.update(sql,new Object[]{email,sessionId},new int[]{Types.VARCHAR,Types.VARCHAR});
        if(result==0){
            return "";
        }
        return "redirect:/base";
    }
}
