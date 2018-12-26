package priv.wangge.springboot_thymeleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {



   @RequestMapping("/usershow")
   public  String showInfo(Model model){
       model.addAttribute("msg","Thymeleaf 第一个案例");
       return "index";
   }
}
