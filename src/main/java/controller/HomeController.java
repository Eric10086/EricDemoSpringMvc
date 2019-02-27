package controller;

import bean.Student;
import mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    private StudentMapper mapper;


    @RequestMapping(value = "/hellowHome")
    public String HellowHome(){
        return "hellowHome";
    }

    @Test
    public void selectByid() {
        Student student = mapper.selectByid(1);
        System.out.println(student);
    }

}
