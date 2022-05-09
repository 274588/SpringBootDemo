package swaggerDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author
 * @desc
 * @date
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello world")
    public String hello(){
        return "Hello World!";
    }
}
