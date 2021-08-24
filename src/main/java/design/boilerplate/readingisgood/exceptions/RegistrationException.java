package design.boilerplate.readingisgood.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@Getter
@RequiredArgsConstructor
public class RegistrationException extends RuntimeException {

	private final String errorMessage;

}
