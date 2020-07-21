package com.example.Interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
@RequestMapping("/locale")
public class LocaleController {

    @GetMapping("/date")
    @ResponseBody
    public String locale(Locale locale){
        System.out.println("Controller is running !");
        return "Hello" + USLocalDateFormatter.getPattern(locale);
    }

    @GetMapping("/swagger/one")
    @ResponseBody
    public String one(){
        System.out.println("Controller is running !");
        return "Hello";
    }
}