package com.example.SPRINGCRUD;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCrudApplication.class, args);
	}

	@RestController
	class BookController{

	}

	interface BookServices {

	}

	interface BookRepository extends JpaRepository<BookModel,Long> {

	}

	class BookServiceImpl implements BookServices {

	}

	@Entity
	@Data
	@NoArgsConstructor
	class BookModel{

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;

		@NotEmpty
		private String title;

		@NotEmpty
		private String author;

		@NotEmpty
		private String cost;

	}

}
