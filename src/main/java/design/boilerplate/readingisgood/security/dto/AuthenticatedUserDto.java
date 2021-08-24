package design.boilerplate.readingisgood.security.dto;

import design.boilerplate.readingisgood.model.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@Getter
@Setter
@NoArgsConstructor
public class AuthenticatedUserDto {

	private String name;

	private String username;

	private String password;

	private UserRole userRole;

}
