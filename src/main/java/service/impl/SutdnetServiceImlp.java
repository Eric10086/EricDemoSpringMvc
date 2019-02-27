package service.impl;

import bean.Student;
import mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.StudentService;

@Service(value = "studentService")
public class SutdnetServiceImlp implements StudentService {

    @Autowired
    private StudentMapper mapper;


    @Override
    public Student selectByid(int id) {
        return mapper.selectByid(id);
    }

    @Test
    public void selectByid1() {
        Student student= mapper.selectByid(1);
        System.out.println(student);
    }
}
