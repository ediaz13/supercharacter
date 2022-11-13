package com.virtualcodemonkeys.project2;

import com.virtualcodemonkeys.project2.repos.SuperCharacterRepo;
import com.virtualcodemonkeys.project2.resolvers.Mutation;
import com.virtualcodemonkeys.project2.resolvers.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Project2Application {

	@Autowired
	SuperCharacterRepo superCharacterRepo;

	@Bean
	public Query query(){return new Query(superCharacterRepo);}

	@Bean
	public Mutation mutation(){return new Mutation(superCharacterRepo);}

	public static void main(String[] args) {
		SpringApplication.run(Project2Application.class, args);
	}

}
