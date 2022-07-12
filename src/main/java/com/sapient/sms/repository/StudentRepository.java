package com.sapient.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sapient.sms.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
