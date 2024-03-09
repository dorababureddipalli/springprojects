package com.pack1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pack1.Entities.Student;
import com.pack1.Repository.Student_Dao;

@SpringBootApplication
public class SpringBootApp2Application {
	// int x=59;
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootApp2Application.class, args);
		Student_Dao bean = run.getBean(Student_Dao.class);
		// Student stdnt = new Student();

//		stdnt.setRollNo(35);
//		stdnt.setStudentName("Anusha");
//		stdnt.setStudentMarks(97);
//		
		Student marksByRoll = bean.findByrollNo(34);
		System.out.println(marksByRoll);
		
//		marksByRoll.forEach(marks -> {
//			System.out.println(marks);
//		});
		run.close();

	}

}
