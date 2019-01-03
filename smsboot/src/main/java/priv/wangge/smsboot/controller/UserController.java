package priv.wangge.smsboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.wangge.smsboot.pojo.Users;
import priv.wangge.smsboot.service.UsersService;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UsersService usersService;

    /*
    * 页面跳转
    * */
    @RequestMapping("/{page}")
    public  String ShowPage(@PathVariable String page){
        return page;
    }

    /*
    * 添加用户
    * */

    @RequestMapping("/addUser")
    public  String addUser(Users users){
        System.out.println("sssss");
        this.usersService.addUsers(users);
        return "ok";
    }
}
