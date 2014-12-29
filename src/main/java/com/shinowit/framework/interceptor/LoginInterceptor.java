package com.shinowit.framework.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2014/12/26.
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object user=session.getAttribute("current_user");
        if (user != null) {
            return true;
        }
        String uri=request.getRequestURI();
        if(uri.endsWith("/base")||uri.startsWith("/product")){
            return true;
        }
//        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        return false;
    }
}
