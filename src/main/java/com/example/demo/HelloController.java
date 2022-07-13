package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
  @RequestMapping("/hello")
  public String hello(Model model) {
    model.addAttribute("hello", "Hello World　MASTERB!");
    return "Hello";
  }
}
