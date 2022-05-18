package com.ncvt.dao;

import com.ncvt.domain.Student;
import java.util.List;
import java.util.Map;

public interface StudentDao {
	public List<Student> queryByCondition(Student stu);
	
	public List<Student> queryByCondition2(Student stu);
	
	public List<Student> queryByCondition3(Student stu);
	
	public void updateByCondtion(Student stu);
	
	public List<Student> queryByCondition4(Student stu);
	
	public void updateByCondtion2(Student stu);
	
	public List<Student> queryByInArray(int[] stuIdArray);
	
	public List<Student> queryByInList(List<Integer> stuIdList);
	
	
	public List<Student> queryByInMap(Map<String, List<Integer>> stuIdMap);
	
	public List<Student> selectStudent();

}
