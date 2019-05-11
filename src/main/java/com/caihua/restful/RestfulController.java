package com.caihua.restful;

import com.alibaba.fastjson.JSON;
import com.caihua.restful.bean.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/users")
public class RestfulController {

    private List<User> users = new ArrayList<>();

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return users;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<User> getUser(@PathVariable("id") Integer id) {
        for (User user : users) {
            if (user.getId() == id) {
                return new ResponseEntity<User>(user, HttpStatus.valueOf(200));
            }
        }
        return new ResponseEntity<User>(new User(), HttpStatus.valueOf(204));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delUser(@PathVariable("id") Integer id) {
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getId() == id) {
                iterator.remove();
            }
        }
        return new ResponseEntity( HttpStatus.valueOf(204));
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
            }
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addUser(User user) {
        users.add(user);
    }
}
