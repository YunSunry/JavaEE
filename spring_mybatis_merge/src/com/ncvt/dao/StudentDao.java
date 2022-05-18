package com.ncvt.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.ncvt.domain.Student;
import com.ncvt.mapper.StudentMapper;

@Component("studentDao")
@Transactional
@EnableTransactionManagement
public class StudentDao {
	@Autowired
	private SqlSessionFactory sessionFactory;

	public List<Student> getAll(Student stu){
		SqlSession session = sessionFactory.openSession();
		try {
			StudentMapper mapper = session.getMapper(StudentMapper.class);
			List<Student> list = mapper.queryByCondition(stu);
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
