package org.example.icode3.Repository;

import org.example.icode3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author $(bilal belhaj)
 **/

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
