package org.example.icode3.dto.categorie;


/**
 * @author $(bilal belhaj)
 **/
public record CategorieResponseDTO(
        Long id,
        String name,
        String description,
        int nombreProduits
) {}
