package design.boilerplate.readingisgood.security.service;

import design.boilerplate.readingisgood.security.dto.BookRequest;
import design.boilerplate.readingisgood.security.dto.RegistrationResponse;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
public interface BookService {

	RegistrationResponse registrationBook(BookRequest bookRequest);

    RegistrationResponse updateStock(BookRequest bookRequest, Long id);
}
