package org.example.icode3.dto.produit;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import org.example.icode3.enums.StatusProduit;

import java.math.BigDecimal;

/**
 * @author $(bilal belhaj)
 **/
public record ProduitUpdateDTO(
        @Size(min = 2, max = 100)
        String title,
        String description,

        @DecimalMin("0.01")
        BigDecimal prix,

        @PositiveOrZero
        Integer stock,

        StatusProduit statut
) {
}
