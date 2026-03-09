package org.example.icode3.dto.produit;

import org.example.icode3.enums.ProductStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author $(bilal belhaj)
 **/
public record ProduitResponseDTO(
        Long id,
        String title,
        String description,
        BigDecimal prix,
        Integer stock,
        ProductStatus statut,
        String categoorieNom,
        int nombreAvis,
        LocalDateTime createdAt
) {
}
