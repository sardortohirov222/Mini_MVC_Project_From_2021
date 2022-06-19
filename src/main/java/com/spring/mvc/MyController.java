package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class MyController {
    @RequestMapping("/")
    public String showFirestView() {
        return "first-view";
    }

    @RequestMapping("askempl")
    public String aksEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-empl";
    }

    @RequestMapping("getempl")
    public String getEmployee(@Valid @ModelAttribute("employee") Employee empl, BindingResult bindingResult) {
    if(bindingResult.hasErrors()){
        return "ask-empl";
    }

        return "get-empl";
    }

    public static void main(String[] args) {
        



    }

}
