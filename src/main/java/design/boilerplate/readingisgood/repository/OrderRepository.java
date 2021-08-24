package design.boilerplate.readingisgood.repository;

import design.boilerplate.readingisgood.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByCreatedDateAfterAndCreatedDateBefore(LocalDateTime after, LocalDateTime before);

    Optional<Order> findById(Long orderId);
}
