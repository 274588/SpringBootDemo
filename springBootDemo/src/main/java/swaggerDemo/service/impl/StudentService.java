package swaggerDemo.service.impl;

import swaggerDemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swaggerDemo.service.IStudentService;
import swaggerDemo.mapper.StudentMapper;


@Service
public class StudentService implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public String getName(Long id) {
        Student student = studentMapper.selectById(id);
        return student == null ? "" : student.getStuName();
    }

    @Override
    public void updateStuClass(Long id, String stuClass) {
        Student entity = new Student();
        entity.setId(id);
        entity.setStuClass(stuClass);
        studentMapper.updateById(entity);
    }
}
