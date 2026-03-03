package org.example.icode3.Repository;

import org.example.icode3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author $(bilal belhaj)
 **/
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
