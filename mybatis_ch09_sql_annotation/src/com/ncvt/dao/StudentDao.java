package com.ncvt.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ncvt.domain.Student;
import com.ncvt.mapper.StudentMapper;

public class StudentDao {
	
	
	private SqlSession session;
	private StudentMapper mapper;
	
	
	public StudentDao(SqlSession session) {
		this.session = session;
		this.mapper = session.getMapper(StudentMapper.class);
		
	}
	
	
	public List<Student> addStudent(Student stu){
		try {
			mapper.insertStudent(stu);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	
	public List<Student> updateStudent(Student stu){
		try {
			mapper.updateStudent(stu);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	
	public void removeStudent(int stuId){
		try {
			mapper.deleteStuddent(stuId);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		
	}
	
	
	
	public List<Student> getAllStudent(){
		try {
			List<Student> list= mapper.selectStudent();
			session.commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	
	public Student getOneStudent(int stuId){
		try {
			Student stu = mapper.getOne(stuId);
			session.commit();
			return stu;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	
	
	
	
	public List<Student> selectStuByContition(String name,Date birthdate){
		try {
			List<Student> list= mapper.selectStuByCondition(name,birthdate);
			session.commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}


}
