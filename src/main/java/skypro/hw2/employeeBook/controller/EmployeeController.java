package skypro.hw2.employeeBook.controller;

import org.springframework.web.bind.annotation.*;
import skypro.hw2.employeeBook.dto.Employee;
import skypro.hw2.employeeBook.service.EmployeeService;
import skypro.hw2.employeeBook.util.EmployeeNameValidator;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee addEmployee(@RequestParam String firstName, @RequestParam String lastName,
                                @RequestParam int department, @RequestParam double salary) {
        EmployeeNameValidator.validateIsAplha(firstName, lastName);
        return employeeService.addEmployee(firstName, lastName, department, salary);
    }

    @GetMapping("/remove")
    public Employee remoteEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        EmployeeNameValidator.validateIsAplha(firstName, lastName);
        return employeeService.removeEmployee(firstName, lastName);
    }

    @GetMapping("/find")
    public Employee getEmployee(@RequestParam String firstName, @RequestParam String lastName) {
        EmployeeNameValidator.validateIsAplha(firstName, lastName);
        return employeeService.getEmployee(firstName, lastName);
    }

    @GetMapping
    public Collection<Employee> getAll() {
        return employeeService.findAll();
    }

}