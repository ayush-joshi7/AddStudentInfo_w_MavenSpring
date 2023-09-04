// Full Name : Ayush Joshi
// Student ID#: 154983217
// Email : ajoshi64@myseneca.ca
// Section : NAA
// Authenticity Declaration:
// I declare this submission is the result of my own work and has not been shared with any other student or 3rd party content provider. 
// This submitted piece of work is entirely of my own creation.

package ayush.assignment2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Assignment2Application {

	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

}
