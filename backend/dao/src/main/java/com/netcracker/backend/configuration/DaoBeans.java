package com.netcracker.backend.configuration;

import com.netcracker.backend.dao.Dao;
import com.netcracker.backend.dao.DaoImpl;
import com.netcracker.entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"com.netcracker.backend.dao"})
public class DaoBeans {

    /**
     * Create studentDao Bean.
     *
     * @return studentDao Bean.
     */
    @Bean(name = "studentDao")
    public Dao<Student, Integer> studentDao() {
        return new DaoImpl<Student, Integer>(Student.class);
    }

}
