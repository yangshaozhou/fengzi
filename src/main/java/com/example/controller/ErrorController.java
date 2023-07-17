package com.example.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//处理服务器出现错误展示的页面
@ControllerAdvice
public class ErrorController {
    @ExceptionHandler(Exception.class)
    public String error(Exception e, Model model){
        e.printStackTrace();
        model.addAttribute("e",e);
        return "500";
    }
}
