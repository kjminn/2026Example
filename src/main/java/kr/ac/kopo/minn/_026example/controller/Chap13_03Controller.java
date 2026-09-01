package kr.ac.kopo.minn._026example.controller;

import kr.ac.kopo.minn._026example.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exam13_03")
public class Chap13_03Controller {
    @ResponseBody
    @GetMapping
    public Person showJsonTypeData(){
        Person person = new Person();
        person.setName("PolyKim");
        person.setAge("30");
        person.setEmail("polykim@kopo.ac.kr");
        System.out.println(person);
        return person;
    }
}
