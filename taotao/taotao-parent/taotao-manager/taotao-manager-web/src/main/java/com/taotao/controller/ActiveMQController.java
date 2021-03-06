package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转controller
 */
@Controller
public class ActiveMQController {

    @RequestMapping("/")
    public  String showIndex(){
        return "index";
    }

    /**
     * 供页面跳转使用
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
