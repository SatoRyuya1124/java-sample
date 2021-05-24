package com.example.demo.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdminitemController {

    @GetMapping("/admin/item/list")
    public String adminitemList(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/list";
    }

    @GetMapping("/admin/item/regist")
    public String adminitemRegist(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/regist";
    }

    @GetMapping("/admin/item/remove")
    public String adminitemRemove(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/remove";
    }

    @GetMapping("/admin/item/edit")
    public String adminitemEdit(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!");
        return "admin/edit";
    }
}

