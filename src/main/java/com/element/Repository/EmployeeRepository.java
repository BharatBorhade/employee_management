package com.element.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.element.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
