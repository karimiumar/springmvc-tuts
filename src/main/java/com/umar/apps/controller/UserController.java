package com.umar.apps.controller;

import com.umar.apps.model.User;
import com.umar.apps.model.UsersContainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome(Model model) {
        model.addAttribute(new User());
        model.addAttribute("message", "This is my first MVC page");
        return "home";
    }

    @RequestMapping(value = "/showUser", method = RequestMethod.POST)
    public String showUser(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("firstName", user.getFirstName());
        model.addAttribute("lastName", user.getLastName());
        model.addAttribute("email", user.getEmail());
        return "user";
    }

    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public String getUsers(Model model) throws Exception {
        List<User> users = getListOfUsers();
        UsersContainer userList = new UsersContainer();
        userList.setUsers(users);
        model.addAttribute("Users", userList);
        return "showUsers";
    }

    @RequestMapping(value = "/saveUsers", method = RequestMethod.POST)
    public String saveUsers(@ModelAttribute("Users") UsersContainer userList) {
        List<User> users= userList.getUsers();
        users.forEach(System.out::println);
        return "redirect:/";
    }

    private List<User> getListOfUsers() {
        List<User> users = new ArrayList<User>();
        users.add(new User("Jack", "Reacher", "abc@xyz.com"));
        users.add(new User("Remington", "Steele", "rs@cbd.com"));
        users.add(new User("Jonathan", "Raven", "jr@sn.com"));
        return users;
    }
}
