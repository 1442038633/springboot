package priv.wangge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
/*
* Spring boot处理异常方式一：自定义异常页面
* */
    @RequestMapping("/show")
    public String showInfo() {
        String str = null;
        str.length();
        return "index";
    }

    @RequestMapping("/show02")
    public String showInfo02() {
        int a = 10/0;
        return "index";
    }

    /**
     *该方法返回一个modelandview：目的是封装异常的信息以及视图的指定
     * 参数Exception e:会将产生的异常对象注入到方法中
     */

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExcepttion(Exception e){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error",e.toString());
        modelAndView.setViewName("error1");
        return  modelAndView;
    }
}
