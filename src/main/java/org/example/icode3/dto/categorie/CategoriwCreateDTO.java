package org.example.icode3.dto.categorie;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * @author $(bilal belhaj)
 **/
public record CategoriwCreateDTO(
        @NotBlank
        @Size(min = 2, max = 100)
        String name,
        String description
) {
}
