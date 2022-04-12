package com.bjp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author Willam_xh
 * @Date 2022-04-07 19:30
 */

/**
 * @RequestMapping:
 *    value ： 所有请求地址的公共部分，叫做模块名称
 *    位置： 放在类的上面
 */
@Controller
public class MyController {

    @RequestMapping(value = {"/user/some.do"})
    public ModelAndView doSome(){// doGet()--service请求处理
        //加了注解后表示可以处理some.do请求了。 （service调用等会再讲）现在相当于service调用处理完成了。
        ModelAndView mv = new ModelAndView();
        //添加数据， 框架在请求的最后把数据放入到request作用域。相当于 //request.setAttribute("msg","欢迎使用springmvc做web开发");
        mv.addObject("msg","欢迎使用springmvc做web开发");
        mv.addObject("fun","执行的是doSome方法");


        mv.setViewName("/index.jsp");

        return mv;

    }

}
