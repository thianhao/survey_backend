package com.survey.apps.service;

import com.survey.apps.entity.Employee;
import com.survey.apps.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Flux<Employee> getAllProducts(){
        return this.repository.findAll();
    }

    public Mono<Employee> getEmployeeById(int employeeId){
        return this.repository.findById(employeeId);
    }

    public Mono<Employee> createEmployee(final Employee employee){
        return this.repository.save(employee);
    }

    public Mono<Employee> updateEmployee(int employeeId, final Mono<Employee> employeeMono){
        return this.repository.findById(employeeId)
                .flatMap(p -> employeeMono.map(u -> {
                    p.setFirstName(u.getFirstName());
                    p.setLastName(u.getLastName());
                    return p;
                }))
                .flatMap(p -> this.repository.save(p));
    }

    public Mono<Void> deleteEmployee(final int id){
        return this.repository.deleteById(id);
    }

}
