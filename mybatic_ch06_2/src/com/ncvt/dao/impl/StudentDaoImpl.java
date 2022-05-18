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


//	实现用户的添加
	@Override
	public void insertStudent(Student s) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.insert("com.ncvt.Mapper.Student.insertStudent", s);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
			
		}finally {
			session.close();
		}

	

	}
	
//	实现用户的删除

	@Override
	public void deleteStudent(int stuId) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
//			session.insert("com.ncvt.Mapper.Student.insertStudent", stu);
			session.delete("com.ncvt.Mapper.Student.deleteStudent",stuId);
			session.commit();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
			
		}finally {
			session.close();
		}
	}


//	更新语句
	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			session.update("com.ncvt.Mapper.Student.updateStudent",s);
			session.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
			
		}finally {
			session.close();
		}
	}

	
	
//	查询语句  查询一条指定的数据
	@Override
	public Student seleteStudentById(int stuId) {
		// TODO Auto-generated method stub
		
		SqlSession session=null;
		try {
			session=factory.openSession();
			Student stu=session.selectOne("com.ncvt.Mapper.Student.seleteStudentById", stuId);
			session.commit();
			return stu;
		}catch(Exception e) {
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();
		}
		
		return null;
	}


	
//	查询多条数据
	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.selectAllStudents");
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
	public int getCount() {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			Integer count = session.selectOne("com.ncvt.Mapper.Student.getCount");
			return count;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();
		}
		return 0;
	}
	
//	第二种查询所有数据的方法 不需要映射
	
	@Override
	public List<Student> selectAllStudents2() {
		// TODO Auto-generated method stub
		
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.selectAllStudents2");
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
	public List<Map> selectAllStudentToHashMap() {
		// TODO Auto-generated method stub
		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Map> list = session.selectList("com.ncvt.Mapper.Student.selectAllStudentToHashMap");
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
	public List<Student> selectStudentByBirthdate(Map date) {
		// TODO Auto-generated method stub

		SqlSession session = null;
		try {
			session = factory.openSession();
			List<Student> list = session.selectList("com.ncvt.Mapper.Student.selectAllStudentByBirthdate",date);
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


	//统计
		@Override
		public int selectStatistics(String value) {
			SqlSession session=null;
			try {
				session = factory.openSession();
				Integer num=session.selectOne("com.ncvt.Mapper.Student.selectStatistics",value);// 调用sql语句
				session.commit();// 提交数据
				return num;
			} catch (Exception e) {
				e.printStackTrace();
				Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
			}finally {
				session.close();// 关闭数据库
			}
			return 0;
		}


	@Override
	public List<Student> selectStudentByName(String value) {
		// TODO Auto-generated method stub
		SqlSession session=null;
		try {
			session = factory.openSession();
			List<Student> list=session.selectList("com.ncvt.Mapper.Student.selectStudentByName",value);// 调用sql语句
			session.commit();// 提交数据
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			Logger.getLogger(StudentDaoImpl.class).debug(e.getMessage());
		}finally {
			session.close();// 关闭数据库
		}
		return null;
	}
	


	


	
	
	
	
}


