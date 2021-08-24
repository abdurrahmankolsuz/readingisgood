package design.boilerplate.readingisgood.security.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@Getter
@Setter
@AllArgsConstructor
public class LoginResponse {

	private String token;

}
