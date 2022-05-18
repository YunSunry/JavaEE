package com.ncvt.mapper;

import com.ncvt.domain.Student;
import java.util.List;
import java.util.Map;

public interface StudentMapper {
	public List<Student> queryByCondition(Student stu);
	
}
