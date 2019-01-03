package priv.wangge.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

/*
 * 全局处理异常类
 * */
//@ControllerAdvice
@Configuration
public class GlobalException implements HandlerExceptionResolver {
    /*    *//**
     * 该方法返回一个modelandview：目的是封装异常的信息以及视图的指定
     * 参数Exception e:会将产生的异常对象注入到方法中
     *//*

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExcepttion(Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("error", e.toString());
        modelAndView.setViewName("error1");
        return modelAndView;
    }*/

    /**
     * 通过SimpleMappingExceptionResolver做全局异常的处理
     * */
    @Bean
    public SimpleMappingExceptionResolver getsimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties mappings = new Properties();
        /**
         * 参数一：异常的类型，注意必须是异常的全名
         * 参数二：视图名称
         * */
        mappings.put("java.lang.ArithmeticException","error1");
        mappings.put("java.lang.NullPointerException", "error2");
//        设置异常与视图信息映射  但是无法传递异常对象
        resolver.setExceptionMappings(mappings);

        return resolver;
    }

    /**
     * 通过HandlerExceptionResolver做全局异常的处理
     */


    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
//        判断不同的异常类型，做不同的视图跳转
        if(e instanceof  ArithmeticException){
            mv.setViewName("error1");
        }
        if(e instanceof  NullPointerException){
            mv.setViewName("error2");
        }

        return null;
    }
}

