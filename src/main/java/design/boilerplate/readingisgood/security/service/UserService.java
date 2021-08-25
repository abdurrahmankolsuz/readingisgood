package design.boilerplate.readingisgood.security.service;

import design.boilerplate.readingisgood.model.Order;
import design.boilerplate.readingisgood.model.User;
import design.boilerplate.readingisgood.security.dto.AuthenticatedUserDto;
import design.boilerplate.readingisgood.security.dto.RegistrationRequest;
import design.boilerplate.readingisgood.security.dto.RegistrationResponse;
import design.boilerplate.readingisgood.security.dto.StatisticsResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
public interface UserService {

    User findByUsername(String username);

    RegistrationResponse registration(RegistrationRequest registrationRequest);

    AuthenticatedUserDto findAuthenticatedUserByUsername(String username);


}
