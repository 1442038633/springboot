package priv.wangge.controller;

/*
* springboot  表单数据校验
* */

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.wangge.pojo.Users;

import javax.validation.Valid;

@Controller
public class UsersController {
    @RequestMapping("/adduser")
    public  String showPage(@ModelAttribute("aa") Users users){
        return "add";
    }

    /* *
     * 完成用户添加
      * @Valid开启对users对象的数据校验
      * BindResult：封装了校验的结果
      * */
    @RequestMapping("/save")
    public String saveUser(@ModelAttribute("aa") @Valid Users users, BindingResult result)
    {
        if(result.hasErrors()){
            return "add";
        }
        return "ok";

    }
}
