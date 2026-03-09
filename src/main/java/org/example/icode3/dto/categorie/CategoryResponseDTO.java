package org.example.icode3.dto.categorie;


/**
 * @author $(bilal belhaj)
 **/
public record CategoryResponseDTO(
        Long id,
        String name,
        String description,
        int nmbProducts
) {}
