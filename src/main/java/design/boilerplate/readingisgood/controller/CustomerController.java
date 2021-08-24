package design.boilerplate.readingisgood.controller;

import design.boilerplate.readingisgood.model.Order;
import design.boilerplate.readingisgood.model.User;
import design.boilerplate.readingisgood.security.dto.RegistrationRequest;
import design.boilerplate.readingisgood.security.dto.RegistrationResponse;
import design.boilerplate.readingisgood.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class CustomerController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<RegistrationResponse> registrationRequest(@Valid @RequestBody RegistrationRequest registrationRequest) {

        final RegistrationResponse registrationResponse = userService.registration(registrationRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(registrationResponse);
    }

    @GetMapping("/orders")
    public ResponseEntity<Map<String, Object>> getAllOrdersByCustomer(
            @RequestParam(required = false) String username,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {

        User user = userService.findByUsername(username);
        Page<Order> pageOrders = userService.getOrdersByUser(user, page, size);

        Map<String, Object> response = new HashMap<>();
        response.put("orders", pageOrders.getContent());
        response.put("currentPage", pageOrders.getNumber());
        response.put("totalItems", pageOrders.getTotalElements());
        response.put("totalPages", pageOrders.getTotalPages());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}


