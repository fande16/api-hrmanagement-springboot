package sn.techKitchen.HRMapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sn.techKitchen.HRMapi.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
}
