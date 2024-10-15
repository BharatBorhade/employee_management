package com.element.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.element.model.Employee;

@Service
public interface EmployeeServices {
	
	 public List<Employee> getAllEmployee();
   public void save(Employee employee);
  public  Employee getById(Long id);
   public void deleteViaId(long id);

}
