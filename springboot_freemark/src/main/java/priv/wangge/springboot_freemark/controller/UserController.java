package priv.wangge.springboot_freemark.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import priv.wangge.springboot_freemark.pojo.User;

import java.util.ArrayList;
import java.util.List;

/*springboot整合jsp*/
@Controller
public class UserController {
    /*处理请求，产生数据*/
    @RequestMapping("/showuser")
    public String showUser(Model model) {

        List<User> list = new ArrayList<>();
        list.add(new User(1, "zhangsan", "20"));
        list.add(new User(2, "lisi", "20"));
        list.add(new User(3, "wangwu", "20"));

        model.addAttribute("list", list);
        return "userList";
    }
}
