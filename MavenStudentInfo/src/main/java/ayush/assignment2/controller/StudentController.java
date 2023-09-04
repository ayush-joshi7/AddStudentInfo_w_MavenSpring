// Full Name : Ayush Joshi
// Student ID#: 154983217
// Email : ajoshi64@myseneca.ca
// Section : NAA
// Authenticity Declaration:
// I declare this submission is the result of my own work and has not been shared with any other student or 3rd party content provider. 
// This submitted piece of work is entirely of my own creation.


package ayush.assignment2.controller;



import ayush.assignment2.model.Student;
import ayush.assignment2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public String getAllStudents(@RequestParam(required = false) String name, Model model) {
        List<Student> students;
        if (name != null && !name.isEmpty()) {
            students = studentRepository.findByName(name);
        } else {

            students = (List<Student>) studentRepository.findAll();
        }
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/add")
    public String showAddStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @GetMapping("/edit/{id}")
    public String showEditStudentForm(@PathVariable String id, Model model) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            model.addAttribute("student", student);
            return "edit-student";
        }

        return "redirect:/students";
    }

    @PostMapping
    public String addStudent(@ModelAttribute Student student) {
        studentRepository.save(student);
        return "redirect:/students";
    }

    @PostMapping("/{id}     ")
    public String updateStudent(@PathVariable String id, @ModelAttribute Student studentDetails) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setStudentNumber(studentDetails.getStudentNumber());
            student.setCourseList(studentDetails.getCourseList());
            student.setGpa(studentDetails.getGpa());
            student.setEmail(studentDetails.getEmail());
            studentRepository.save(student);
        }
        return "redirect:/students";
    }

    @PostMapping("/{id}/delete")
    public String deleteStudent(@PathVariable String id) {
        Student student = studentRepository.findById(id).orElse(null);

        if (student != null) {
            student.setId(null);
            studentRepository.deleteById(id);
        }

        return "redirect:/students";
    }

}
