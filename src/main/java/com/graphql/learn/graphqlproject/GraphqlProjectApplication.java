package com.graphql.learn.graphqlproject;

import com.graphql.learn.graphqlproject.entity.EmpDetails;
import com.graphql.learn.graphqlproject.service.impl.EmpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {

	@Autowired
	private EmpServiceImpl empServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(GraphqlProjectApplication.class, args);
	}

	// create some employee details which store in database H2
	@Override
	public void run(String... args) throws Exception {
		EmpDetails e1 = new EmpDetails();
		e1.setEmpName("Jaydeep Das");
		e1.setEmpRole("Junior Software Developer");
		e1.setEmpRating(1234);
		e1.setSalary(50000);
		e1.setLocation("Kolkata");

		EmpDetails e2 = new EmpDetails();
		e2.setEmpName("Mayank Gupta");
		e2.setEmpRole("Senior Software Developer");
		e2.setEmpRating(5678);
		e2.setSalary(100000);
		e2.setLocation("Delhi");

		EmpDetails e3 = new EmpDetails();
		e3.setEmpName("N. Saha");
		e3.setEmpRole("System Engineer");
		e3.setEmpRating(2345);
		e3.setSalary(40000);
		e3.setLocation("Kolkata");

		this.empServiceImpl.addEmp(e1);
		this.empServiceImpl.addEmp(e2);
		this.empServiceImpl.addEmp(e3);

	}

}
