package edu.miu.cs.cs425.lab9.eregistrarwebapi.conifg;

import edu.miu.cs.cs425.lab9.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.lab9.eregistrarwebapi.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;
@Configuration
public class configaration {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student s1 = new Student("000-61-0001", "Anna", "Lynn", "Smith", 1.45,LocalDate.of(2008,7,04),"Yes");
            Student s2 = new Student("000-61-0002", "Okbit", "Berhe", "Hailab", 3.45,LocalDate.of(2013,7,04),"Yes");
            Student s3 = new Student("000-61-0003", "Senay", "Habte", "Desta", 2.45,LocalDate.of(2009,7,04),"Yes");
            Student s4 = new Student("000-61-0004", "Awet", "Fray", "Tekle", 3.45,LocalDate.of(2014,7,04),"Yes");


            repository.saveAll(List.of(s1,s2,s3,s4));
        };

    }
}


