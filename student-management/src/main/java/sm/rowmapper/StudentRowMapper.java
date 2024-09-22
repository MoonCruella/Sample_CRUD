package sm.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import sm.api.Student;


public class StudentRowMapper implements org.springframework.jdbc.core.RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		
		student.setId(rs.getInt("id")); //1
		student.setName(rs.getString("name")); //nguyet
		student.setMobile(rs.getLong("mobile"));; //459443
		student.setCountry(rs.getString("country"));;;//VietNam
		
		return student;
	}

}
