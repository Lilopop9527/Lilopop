package com.auth.dao;

import com.auth.pojo.base.Department;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    Page<Department> findDepartmentByDeleated(Integer deleated, Pageable pageable);
}
