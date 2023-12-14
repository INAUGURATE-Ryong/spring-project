package com.example.springproject.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InfoController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String phone = "010-2315-2131";
        ModelAndView mav = new ModelAndView();

        mav.addObject("name","yuna"); //data save
        mav.addObject("phone",phone);
        mav.setViewName("/WEB-INF/views/info.jsp");

        return mav;
    }
}
