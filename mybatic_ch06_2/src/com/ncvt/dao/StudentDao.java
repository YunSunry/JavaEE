package com.ncvt.dao;

import com.ncvt.domain.Student;
import java.util.List;
import java.util.Map;

public interface StudentDao {
	public void insertStudent(Student s);
	
	public void deleteStudent(int stuId);
	
	public void updateStudent(Student s);
	
	public Student seleteStudentById(int stuId);
	
	
	public List<Student> selectAllStudents();
	
	public int getCount();
	
	public List<Student> selectAllStudents2();
	
	public List<Map> selectAllStudentToHashMap();
	
	
	public List<Student> selectStudentByBirthdate(Map date);
	
	public int selectStatistics(String value);
	public List<Student> selectStudentByName(String value);
	
}
