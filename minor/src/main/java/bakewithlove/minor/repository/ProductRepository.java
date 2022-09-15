package bakewithlove.minor.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import bakewithlove.minor.model.Product;


@Repository
public interface ProductRepository extends JpaRepository <Product,Long>{
    @Query(value="SELECT * FROM PRODUCT WHERE NAME LIKE %:keyword%",nativeQuery=true)
    List<Product> findByKeyword(@Param("keyword") String keyword);
    List<Product> findAllByCategory_Id(int id);
}
