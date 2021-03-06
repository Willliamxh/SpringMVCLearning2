package com.bjp.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器类：拦截用户的请求。  类似AOP环绕通知
public class MyInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("111111-拦截器的MyInterceptor的preHandle()");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler, ModelAndView mv) throws Exception {
        System.out.println("111111-拦截器的MyInterceptor的postHandle()");
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
        System.out.println("111111-拦截器的MyInterceptor的afterCompletion()");
    }
}
