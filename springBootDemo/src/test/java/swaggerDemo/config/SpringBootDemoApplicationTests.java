package swaggerDemo.config;

import swaggerDemo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SpringBootDemoApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    public void myTest1(){
        Date date = new Date();
        System.out.println("date = " + date);
        System.out.println(String.format("%tF", date));
    }

    @Test
    public void myTest2(){
        ArrayList<Student> list = new ArrayList<>();
//        List<Integer> longList = ;
//        System.out.println("mytest2: " + Optional.ofNullable(list.stream().map(m -> m.getId()).collect(Collectors.toList())).orElse(Arrays.asList(1,3,5)));
    }
}
