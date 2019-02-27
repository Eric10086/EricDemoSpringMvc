import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.StudentService;

public class Student {

    @Autowired
    private StudentService studentService;

    @Test
    public void test01(){

        studentService.selectByid(1);
    }
}
