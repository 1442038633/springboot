package priv.wangge.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import priv.wangge.springboot.filter.FirstFilter;
import priv.wangge.springboot.listener.FirstListener;
import priv.wangge.springboot.servlet.FirstServlet;

@SpringBootApplication
@ServletComponentScan          //在springboot启动时会扫描@webservlet，并将该类实例化



public class SpringbootApplication {


    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }


/*    *//*springboot整合servlet第二种方式*//*
    @Bean
    public ServletRegistrationBean getServletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new FirstServlet());
        servletRegistrationBean.addUrlMappings("/second");
        return servletRegistrationBean;
    }*/

    /*springboot整合filter的第二种方法*/
/*    @Bean
    public FilterRegistrationBean getFilterRegisterbean(){
        FilterRegistrationBean bean = new
                FilterRegistrationBean(new FirstFilter());
        bean.addUrlPatterns("/secondfilter");
        return  bean;
    }*/

    /*springboot整合listener第二种方式*/
    @Bean
    public ServletListenerRegistrationBean<FirstListener> getServletListenerRegistrationBeanbean(){
        ServletListenerRegistrationBean<FirstListener> bean = new ServletListenerRegistrationBean<FirstListener>(new FirstListener());
        return  bean;

    }

}

