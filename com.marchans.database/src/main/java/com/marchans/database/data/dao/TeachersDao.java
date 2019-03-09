package com.marchans.database.data.dao;

import com.marchans.database.data.entities.Teacher;

public interface TeachersDao {

	void addTeacher(Teacher teacher);
	Teacher getTeacherById(int id);
	void saveTacher(Teacher teacher);

}
