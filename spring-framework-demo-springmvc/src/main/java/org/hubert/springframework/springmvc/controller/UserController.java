package org.hubert.springframework.springmvc.controller;

import org.hubert.springframework.springmvc.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

/**
 * @author hubertwong
 */
@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * find user list
     *
     * @param request  request
     * @param response response
     * @return model and view
     */
    @RequestMapping("/user")
    public ModelAndView list(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dateTime", LocalDateTime.now());
        modelAndView.addObject("userList", userService.findUserList());
        // views目录下userList.jsp
        modelAndView.setViewName("userList");
        return modelAndView;
    }
}
