package sm.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import sm.DAO.IStudentDAO;
import sm.api.Student;


@Controller
public class StudentController {
	
	@Autowired
	private IStudentDAO studentDAO; 
		
	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		
		
		List<Student> studentList = studentDAO.loadStudents();
		model.addAttribute("students",studentList);
		
		return "student-list";
	}

}
