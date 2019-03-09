//import java.sql.Date;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marchans.database.Student;
import com.marchans.database.data.entities.Teacher;
import com.marchans.database.worker.WorkWithStudents;
import com.marchans.database.worker.WorkWithTeacher;

public class App{
public static void main( String[] args ){
ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
/*WorkWithStudents worker = 
(WorkWithStudents) context.getBean("worker");
new WorkWithStudents();
Student testStudent = new Student("Vlad Valt", 5);
worker.saveStudentToDb(testStudent);
}*/

WorkWithTeacher workWithTeacher = 
(WorkWithTeacher) context.getBean("teachersWorker");
Teacher teacher = new Teacher();
teacher.setFirstname("Anastasiia");
teacher.setLastname("Marchenko");
teacher.setCellphone("+380111111111");
teacher = workWithTeacher.addTeacher(teacher);
teacher.setBirthDate(new Date());
workWithTeacher.saveTacher(teacher);

}
}

