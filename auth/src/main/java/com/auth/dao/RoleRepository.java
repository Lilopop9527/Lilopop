package com.auth.dao;

import com.auth.pojo.base.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Long> {
    @Query(value = "select * from ROLE where deleated = :del and id in (:ids)",nativeQuery = true)
    List<Role> getRoles(@Param("ids") List<Long> roles,@Param("del") Integer del);

    Role findRoleById(Long id);

    List<Role> findRoleByIdIn(Long[] id);

    Integer countRoleByRoleName(String roleName);
}
