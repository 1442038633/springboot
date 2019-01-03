package priv.wangge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("showuser")
    public String showuser(){
        String str = null;
        str.length();
        return "index";
    }


    @RequestMapping("showuser2")
    public String showuser2(){
        int a = 10/0;
        return "index";
    }

}
