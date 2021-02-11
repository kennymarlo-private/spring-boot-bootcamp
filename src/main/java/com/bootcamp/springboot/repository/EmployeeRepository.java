package com.bootcamp.springboot.repository;

import com.bootcamp.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "select e from Employee e where e.firstName = ?1")
    Employee findByFirstName(String name);
}
