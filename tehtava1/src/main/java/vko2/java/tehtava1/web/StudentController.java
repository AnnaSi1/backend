package vko2.java.tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

     @GetMapping("/hello2")
        public String Students(){
        return "students";
    }

}
