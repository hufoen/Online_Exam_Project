package com.xzq.online_exam.dao;

import com.xzq.online_exam.domain.StudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentInfoMapper {

    /**
     * 获取学生的总数
     * @return
     */
    public int getStudentTotal();

    public List<StudentInfo> getAllStudents();

    public void deleteOne(Integer id);

    public void addOne(StudentInfo studentInfo);

    public void updateOneStudent(StudentInfo studentInfo);

    public Integer checkUser(String studentName);

    public StudentInfo getStudentWithPwd(String studentAccount);
}
