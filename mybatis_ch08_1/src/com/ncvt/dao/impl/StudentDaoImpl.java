package com.ncvt.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;
import com.ncvt.dao.StudentDao;
import com.ncvt.domain.Student;
import org.apache.log4j.Logger;
public class StudentDaoImpl implements StudentDao {
	private SqlSessionFactory factory;
	

	public StudentDaoImpl(SqlSessionFactory factory) {
		
		this.factory = factory;
	}


	@Override
	public List<Student> queryByCondition(Student stu) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.queryByCondition",stu);
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}


	@Override
	public List<Student> queryByCondition2(Student stu) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.queryByCondition2",stu);
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}

	

	@Override
	public List<Student> queryByCondition3(Student stu) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.queryByCondition3",stu);
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}


	@Override
	public void updateByCondtion(Student stu) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.update("com.ncvt.Mapper.Student.updateByCondtion",stu);
			session.commit();
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		
	}
	
	
	@Override
	public List<Student> queryByCondition4(Student stu) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.queryByCondition4",stu);
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}
	
	
	@Override
	public void updateByCondtion2(Student stu) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.update("com.ncvt.Mapper.Student.updateByCondtion2",stu);
			session.commit();
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		
	}


	@Override
	public List<Student> queryByInArray(int[] stuIdArray) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.queryByInArray",stuIdArray);
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}


	@Override
	public List<Student> queryByInList(List<Integer> stuIdList) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.queryByInList",stuIdList);
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}


	@Override
	public List<Student> queryByInMap(Map<String, List<Integer>> stuIdMap) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.queryByInMap",stuIdMap);
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}


	@Override
	public List<Student> selectStudent() {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.selectStudent");
			session.commit();
			return list;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		} finally {
			// TODO: handle finally clause
			
		}
		return null;
	}


	
	
	
}


