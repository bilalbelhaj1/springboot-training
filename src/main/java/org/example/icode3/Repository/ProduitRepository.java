package org.example.icode3.Repository;

import org.example.icode3.entity.Avi;
import org.example.icode3.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author $(bilal belhaj)
 **/
public interface ProduitRepository extends JpaRepository<Produit, Long> {

    @Query("""
           SELECT p
           FROM Produit p
           WHERE p.prix < :max
           ORDER BY p.prix ASC
           """)
    List<Produit> findProduitsWithPrixLessThan(@Param("max") BigDecimal max);

    @Query("""
           SELECT p
           FROM Produit p
           JOIN p.categorie c
           WHERE c.name = :nomCategorie
           """)
    List<Produit> findByCategorieNomWithJoin(@Param("nomCategorie") String nomCategorie);
}
