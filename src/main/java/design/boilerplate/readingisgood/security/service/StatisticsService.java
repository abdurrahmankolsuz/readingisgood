package design.boilerplate.readingisgood.security.service;

import design.boilerplate.readingisgood.model.Order;
import design.boilerplate.readingisgood.model.User;
import design.boilerplate.readingisgood.security.dto.OrderRequest;
import design.boilerplate.readingisgood.security.dto.RegistrationResponse;
import design.boilerplate.readingisgood.security.dto.StatisticsResponse;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
public interface StatisticsService {

    StatisticsResponse getStatistics(User user, int month, int year);
}
