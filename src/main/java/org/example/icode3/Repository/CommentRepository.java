package org.example.icode3.Repository;

import org.example.icode3.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author $(bilal belhaj)
 **/
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
