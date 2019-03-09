package com.marchans.database.data.dao;

import com.marchans.database.Student;

public interface StudentsDao {
	void addStudent(Student student);
	
	public Student getStudentById(int id);
}
