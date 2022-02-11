package bakewithlove.minor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bakewithlove.minor.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Integer>{
    
}
