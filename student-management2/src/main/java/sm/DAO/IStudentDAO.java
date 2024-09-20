package sm.DAO;

import java.util.List;

import sm.api.Student;

public interface IStudentDAO {
	
	List<Student> loadStudents();
	
	
}
