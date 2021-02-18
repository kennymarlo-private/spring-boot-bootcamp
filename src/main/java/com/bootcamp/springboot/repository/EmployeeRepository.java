package com.bootcamp.springboot.repository;

import com.bootcamp.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // @Query(value = "select e from Employee e where e.firstName = :firstName and e.lastName = :lastName")
    Employee findByFirstName(@Param("firstName") String firstName, @Param("lastName") String lastName);

}
