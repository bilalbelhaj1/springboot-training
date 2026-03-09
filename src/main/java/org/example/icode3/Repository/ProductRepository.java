package org.example.icode3.Repository;

import org.example.icode3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author $(bilal belhaj)
 **/
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("""
           SELECT p
           FROM Product p
           WHERE p.price < :max
           ORDER BY p.price ASC
           """)
    List<Product> findProductsWithPriceLessThan(@Param("max") BigDecimal max);

    @Query("""
           SELECT p
           FROM Product p
           JOIN p.category c
           WHERE c.name = :nomCategorie
           """)
    List<Product> findByCategoryNomWithJoin(@Param("categoryName") String categoryName);
}
