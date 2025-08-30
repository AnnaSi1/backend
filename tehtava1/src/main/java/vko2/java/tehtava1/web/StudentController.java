package vko2.java.tehtava1.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vko2.java.tehtava1.domain.Student;



@Controller
public class StudentController {
    public static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("Aku", "Ankka"));
        students.add(new Student("Anna", "Silvola"));
        students.add(new Student("Tauno", "Testi"));

    }
    

     @GetMapping("/hello2")
        public String showStudents(Model model){
        model.addAttribute("students", students);
            return "students";
    }

}
