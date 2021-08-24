package design.boilerplate.readingisgood.security.service;

import design.boilerplate.readingisgood.model.Order;
import design.boilerplate.readingisgood.security.dto.OrderRequest;
import design.boilerplate.readingisgood.security.dto.RegistrationResponse;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
public interface OrderService {

	RegistrationResponse placeOrder(OrderRequest orderRequest);

    List<Order> findAllByCreatedDateAfterAndCreatedDateBefore(LocalDateTime after, LocalDateTime before);

    Optional<Order> findByOrderId(Long orderId);
}
