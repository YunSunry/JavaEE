package com.ncvt.mapper;

import com.ncvt.domain.Student;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentMapper {
	
	@Insert("insert into student(stu_name,stu_birthdate,stu_phone) value(#{stuName},#{stuBirthdate},#{stuPhone})")
	public void insertStudent(Student stu);
	
	@Update("UPDATE student SET stu_name=#{stuName},stu_birthdate=#{stuBirthdate},stu_phone=#{stuPhone} where stu_id=#{stuId}")
	public void updateStudent(Student stu);
	
	@Delete("DELETE FROM student WHERE stu_id = #{stuId}")
	public void deleteStuddent(int stuId);
	
	@Results(id="studentmap",value= {
			@Result(column = "stu_id",property = "stuId"),
			@Result(column = "stu_name",property = "stuName"),
			@Result(column = "stu_birthdate",property = "stuBirthdate"),
			@Result(column = "stu_phone",property = "stuPhone")
	})
	@Select("select * from student")
	public List<Student> selectStudent();
	
	@ResultMap("studentmap")
	@Select("select * from student where stu_id=#{stuId}")
	public Student getOne(int stuId);
	
	
	@ResultMap("studentmap")
	@Select("<script>select * from student where 1=1\r\n"
			+ "		<if test=\"stuName != null and stuName!= ''\">\r\n"
			+ "			and stu_name like '%${stuName}%'\r\n"
			+ "		</if>\r\n"
			+ "		\r\n"
			+ "		<if test=\"stuBirthdate != null\">\r\n"
			+ "			and stu_birthdate=#{stuBirthdate}\r\n"
			+ "		</if></script>")
	public List<Student> selectStuByCondition(@Param("stuName") String stuName,@Param("stuBirthdate") Date stuBirthdate);
	
	
}
