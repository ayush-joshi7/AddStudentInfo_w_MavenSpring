// Full Name : Ayush Joshi
// Student ID#: 154983217
// Email : ajoshi64@myseneca.ca
// Section : NAA
// Authenticity Declaration:
// I declare this submission is the result of my own work and has not been shared with any other student or 3rd party content provider. 
// This submitted piece of work is entirely of my own creation.

package ayush.assignment2.repository;

import ayush.assignment2.model.Student;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String name);
}