package design.boilerplate.readingisgood.repository;

import design.boilerplate.readingisgood.model.Order;
import design.boilerplate.readingisgood.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	User findByUsername(String username);

	boolean existsByEmail(String email);

	boolean existsByUsername(String username);

	Page<Order> getOrdersByUserId(Long userId, Pageable pageable);



}
