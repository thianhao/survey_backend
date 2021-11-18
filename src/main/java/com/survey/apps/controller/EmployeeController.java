package com.survey.apps.controller;

import com.survey.apps.entity.Employee;
import com.survey.apps.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("all")
    public Flux<Employee> getAll(){
        return this.employeeService.getAllProducts();
    }

    @GetMapping("{employeeId}")
    public Mono<ResponseEntity<Employee>> getEmployeeById(@PathVariable int productId){
        return this.employeeService.getEmployeeById(productId)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Mono<Employee> createEmployee(@RequestBody Mono<Employee> employeeMono){
        return employeeMono.flatMap(this.employeeService::createEmployee);
    }

    @PutMapping("{productId}")
    public Mono<Employee> updateEmployee(@PathVariable int productId,
                                       @RequestBody Mono<Employee> productMono){
        return this.employeeService.updateEmployee(productId, productMono);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteEmployee(@PathVariable int id){
        return this.employeeService.deleteEmployee(id);
    }

}
