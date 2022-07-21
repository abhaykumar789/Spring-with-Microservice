package com.cgi.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cgi.main.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

	Department findBydid(int did);

}
