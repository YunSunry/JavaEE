package com.ncvt.dao;

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
	
	
	public List<Student> getAll(Student stu){
		try {
			List<Student> list = mapper.queryByCondition(stu);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			session.close();
		}
		return null;
	}
	

}
