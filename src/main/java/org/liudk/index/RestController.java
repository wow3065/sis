package org.liudk.index;

import org.liudk.mapper.User;
import org.liudk.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by dengke.liu on 2016/08/19.
 */
@Controller
public class RestController implements Serializable{

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/test",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public List<User> getJson(User user){
        List<User> userList = userDao.findAllUser();
        return userList;
    }
}
