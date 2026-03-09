package org.example.icode3.dto.produit;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import org.example.icode3.enums.ProductStatus;

import java.math.BigDecimal;

/**
 * @author $(bilal belhaj)
 **/
public record ProductUpdateDTO(
        @Size(min = 2, max = 100)
        String title,
        String description,

        @DecimalMin("0.01")
        BigDecimal prix,

        @PositiveOrZero
        Integer stock,

        ProductStatus statut
) {
}
