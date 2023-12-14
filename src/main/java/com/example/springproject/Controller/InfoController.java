package com.example.springproject.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//public class InfoController implements Controller {
@Controller
public class InfoController {

//    public ModelAndView info(ModelAndView mav){
    @RequestMapping("/info")  // 인포라고 쳐서 들어오면 info서블릿으로 들어옴
        public String info(Model model){
            model.addAttribute("name","yuna");
            model.addAttribute("tel","0000");

            return "info";

    }

}
