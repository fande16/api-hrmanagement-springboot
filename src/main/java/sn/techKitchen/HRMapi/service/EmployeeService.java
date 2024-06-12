package sn.techKitchen.HRMapi.service;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.techKitchen.HRMapi.model.Employee;
import sn.techKitchen.HRMapi.repository.EmployeeRepository;

import java.util.Optional;

@Service
@Data
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Optional<Employee> getEmployee(final Long id){
        return employeeRepository.findById(id);
    }
    public Iterable<Employee> getEmployees(){
        return employeeRepository.findAll();
    }
    public void deleteEmployee(final Long id){
        employeeRepository.deleteById(id);
    }
    public Employee saveEmployee(Employee employee){
        Employee savedEmployee=employeeRepository.save(employee);
        return savedEmployee;
    }
}
