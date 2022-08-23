package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jane_doe = new Student(
                    "Jane Doe",
                    "jane.doe@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );

            Student john_doe = new Student(
                    "John Doe",
                    "john.doe@gmail.com",
                    LocalDate.of(1998, Month.JANUARY, 5)
            );

            repository.saveAll(
                    List.of(jane_doe, john_doe)
            );
        };
    }
}
