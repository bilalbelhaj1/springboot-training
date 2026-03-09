package org.example.icode3.dto.produit;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

/**
 * @author $(bilal belhaj)
 **/
public record ProductCreateDTO(
        @NotBlank @Size(min = 2, max = 100)
        String title,
        String description,

        @NotNull @DecimalMin("0.01")
        BigDecimal price,

        @PositiveOrZero
        Integer stock,

        @NotNull
        Long categoryId
) {
}
