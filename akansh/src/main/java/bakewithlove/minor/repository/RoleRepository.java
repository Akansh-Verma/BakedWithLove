package bakewithlove.minor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bakewithlove.minor.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{
    
}
