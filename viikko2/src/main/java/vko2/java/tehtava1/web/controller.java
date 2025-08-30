package vko2.java.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class controller {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name, 
    @RequestParam int age, Model model) {
       model.addAttribute("nimi", name);
       model.addAttribute("ika", age);
        return "hello";
    }
    
}
