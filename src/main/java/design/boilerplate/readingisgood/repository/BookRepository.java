package design.boilerplate.readingisgood.repository;

import design.boilerplate.readingisgood.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
