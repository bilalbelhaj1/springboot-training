package org.example.icode3.dto.avis;

import java.time.LocalDateTime;

/**
 * @author $(bilal belhaj)
 **/
public record AvisResponseDTO(
        Long id,
        String contenu,
        Integer note,
        String produitTitre,
        LocalDateTime createdAt
) {
}
