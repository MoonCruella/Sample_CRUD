package sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import sm.api.Student;
import sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements IStudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public List<Student> loadStudents() {
		
		
		String sql = "SELECT * FROM students";
		
		List<Student> theListOfStudent = jdbcTemplate.query(sql,new StudentRowMapper());

		
		return theListOfStudent;
	}

}
