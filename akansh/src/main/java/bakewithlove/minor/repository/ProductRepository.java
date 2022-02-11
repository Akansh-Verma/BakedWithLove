package bakewithlove.minor.repository;

import bakewithlove.minor.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Long>{
    List<Product> findAllByCategory_Id(int id);
}
