package com.shinowit.web;

import com.shinowit.tools.Email;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/1/15.
 */
@Controller
@RequestMapping("/")
public class doubigao {
    @Resource
    private Email email;


    @RequestMapping("/doubigao")
    public void doubigao(){
        for(int a=0;a<1000;a++){
            email.sendMail("欢迎逗比高，有本事你来打我啊！","本人学识渊博、经验丰富，代码风骚、效率恐怖，c/c++、java、php无不精通，熟练掌握各种框架，深山苦练20余年，一天只睡4小时，千里之外定位问题，瞬息之间修复上线。身体强壮、健步如飞，可连续编程100小时不休息，讨论技术方案5小时不喝水，上至带项目、出方案，下至盗账号、威胁pm，啥都能干。泡面矿泉水已备好，学校不支持编程已辍学，家人不支持编程已断绝关系，老婆不支持编程已离婚，小孩不支持编程已送孤儿院，备用电源万兆光纤永不断电断网，门口已埋雷无人打扰","724964028@qq.com");
            try{
                Thread.currentThread().sleep(10000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
