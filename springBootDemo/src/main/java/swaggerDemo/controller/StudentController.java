package swaggerDemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import swaggerDemo.service.IStudentService;

@RestController
@RequestMapping("/student")
@Api(value = "学生表")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @ApiOperation(value = "获取学生姓名")
    @GetMapping("getName")
    public String getName(@ApiParam(value = "id") @RequestParam Long id){
        return studentService.getName(id);
    }

    @ApiOperation(value = "修改学生班级")
    @GetMapping("getStuClass")
    public void getStuClass(@ApiParam(value = "id") @RequestParam Long id,
                              @ApiParam(value = "修改班级") @RequestParam String stuClass){
        studentService.updateStuClass(id, stuClass);
    }

}
