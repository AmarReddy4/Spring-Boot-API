package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
                   Student Amar = new Student(
                            "Amar",
                            "amar.ramareddy@gmail.com,",
                            LocalDate.of(2078, JANUARY, 31)
                    );

                   Student Rama = new Student(
                            "Rama",
                            "rama.amarreddy@gmail.com,",
                            LocalDate.of(2075, JANUARY, 31)
                    );

                   repository.saveAll(List.of(Amar, Rama));
        };

    }
}
