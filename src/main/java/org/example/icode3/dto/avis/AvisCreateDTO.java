package org.example.icode3.dto.avis;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * @author $(bilal belhaj)
 **/
public record AvisCreateDTO(
        @NotBlank
        String contenu,

        @NotNull @Min(1) @Max(5)
        Integer note,

        @NotNull
        Long produitId
) {
}
