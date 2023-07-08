package com.ritesh.EmployeeAddress.Management.repo;

import com.ritesh.EmployeeAddress.Management.model.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
    @Modifying
    @Query(value = "update employee_table set first_name = :firstName , last_name = :lastName where id = :id" , nativeQuery = true)
    void updateEmployee(String firstName, String lastName, Long id);


}
