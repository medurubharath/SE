package com.dsms.app.repository;

import com.dsms.app.entity.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department, Integer> {
}