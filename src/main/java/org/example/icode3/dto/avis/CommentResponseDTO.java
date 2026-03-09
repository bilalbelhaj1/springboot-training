package org.example.icode3.dto.avis;

import java.time.LocalDateTime;

/**
 * @author $(bilal belhaj)
 **/
public record CommentResponseDTO(
        Long id,
        String comment,
        Integer ratting,
        String ProductTitle,
        LocalDateTime createdAt
) {
}
