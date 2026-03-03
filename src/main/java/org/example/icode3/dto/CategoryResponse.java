package org.example.icode3.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author $(bilal belhaj)
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CategoryResponse {
    long id;
    String name;
    String description;
    int nombreCategories;

}
