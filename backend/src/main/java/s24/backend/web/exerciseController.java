package s24.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class exerciseController {

    @RequestMapping("index")
    @ResponseBody
    public String returnMessage() {
        return "This is the main page";
    }

    @RequestMapping("contact")
    @ResponseBody
    public String returnMessage2() {
        return "This is the contact page";
    }

    @RequestMapping("hello")
    @ResponseBody
    public String returnMessage3(
            @RequestParam(name = "name") String name,
           @RequestParam String location) {
        return "Welcome to the " + location + " " + name + "!"; }
}
