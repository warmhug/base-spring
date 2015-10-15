package me.rest;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by hua on 15/10/8.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
