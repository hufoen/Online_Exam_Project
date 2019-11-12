package com.xzq.online_exam.dao;

import com.xzq.online_exam.domain.ClassInfo;
import org.apache.ibatis.annotations.MapKey;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface ClassInfoMapper {

    /**
     * 获取所有班级信息带上班主任的名字
     * @param classInfo
     * @return
     */
    public List<ClassInfo> getAllClassesWithTeacherName(ClassInfo classInfo);

    /**
     * 根据班级id获取每个班级学生的数量
     * @param gradeId
     * @return
     */
    //指定某一列的值为Map的键
    @MapKey("className")
    Map<String, Object> getStudentCountForClass(Integer gradeId);
}
