package sn.techKitchen.HRMapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sn.techKitchen.HRMapi.model.Employee;
import sn.techKitchen.HRMapi.service.EmployeeService;

import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") final Long id) {
        Optional<Employee> employee=employeeService.getEmployee(id);
        if(employee.isPresent()){
            return employee.get();
        }
        else {
            return null;
        }

    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") final Long id, @RequestBody Employee employee){
        Optional<Employee> employee1=employeeService.getEmployee(id);

        if(employee1.isPresent()){
            Employee currentEmployee=employee1.get();

            String firstname=employee.getFirst_name();
            if(firstname!=null){
                currentEmployee.setFirst_name(firstname);
            }
            String lastname=employee.getLast_name();
            if(lastname!=null){
                currentEmployee.setLast_name(lastname);
            }
            String mail=employee.getMail();
            if(mail!=null){
                currentEmployee.setMail(mail);
            }
            String password=employee.getPassword();
            if(password!=null){
                currentEmployee.setPassword(password);
            }
            employeeService.saveEmployee(currentEmployee);
            return currentEmployee;
        }
        else {
            return null;
        }
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") final Long id) {
        employeeService.deleteEmployee(id);
    }



}