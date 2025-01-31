package com.quitsmoking.quitsmoking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.quitsmoking.quitsmoking.model.Person;
import com.quitsmoking.quitsmoking.repository.PersonRepo;

@SpringBootApplication
public class QuitsmokingApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(QuitsmokingApplication.class, args);

		Person Satish=context.getBean(Person.class);
		Satish.setId(1);
		Satish.setNam("Satish.B");
		Satish.setAge(29);
		Satish.setGender("M");
		Satish.setYears(5);
		Satish.setMonths(8);
		Satish.setN(2);

		PersonRepo pr=context.getBean(PersonRepo.class);
		pr.save(Satish);
		pr.findAll();
	}

}
