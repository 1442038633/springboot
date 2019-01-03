package priv.wangge.smsboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import priv.wangge.smsboot.mapper.UsersMapper;
import priv.wangge.smsboot.pojo.Users;
import priv.wangge.smsboot.service.UsersService;

@Service
@Transactional
public class UserServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUsers(Users users) {
        this.usersMapper.insertUser(users);
    }
}
