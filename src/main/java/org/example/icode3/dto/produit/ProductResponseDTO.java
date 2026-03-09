package org.example.icode3.dto.produit;

import org.example.icode3.enums.ProductStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author $(bilal belhaj)
 **/
public record ProductResponseDTO(
        Long id,
        String title,
        String description,
        BigDecimal price,
        Integer stock,
        ProductStatus status,
        String categoryName,
        int nbrComments,
        LocalDateTime createdAt
) {
}
