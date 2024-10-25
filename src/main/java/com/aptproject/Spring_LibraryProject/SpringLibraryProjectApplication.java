package com.aptproject.Spring_LibraryProject;

import com.aptproject.Spring_LibraryProject.dbexample.dao.BookDaoJDBC;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLibraryProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringLibraryProjectApplication.class, args);

	}

	@Override
	public void run(String[] args) throws Exception{
		BookDaoJDBC bookDaoJDBC = new BookDaoJDBC();
		bookDaoJDBC.findBookById(3);
	}

}
