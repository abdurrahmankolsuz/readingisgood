package design.boilerplate.readingisgood.security.jwt;

import design.boilerplate.readingisgood.model.User;
import design.boilerplate.readingisgood.security.dto.AuthenticatedUserDto;
import design.boilerplate.readingisgood.security.dto.LoginRequest;
import design.boilerplate.readingisgood.security.dto.LoginResponse;
import design.boilerplate.readingisgood.security.mapper.UserMapper;
import design.boilerplate.readingisgood.security.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class JwtTokenService {

	private final UserService userService;

	private final JwtTokenManager jwtTokenManager;

	private final AuthenticationManager authenticationManager;

	public LoginResponse getLoginResponse(LoginRequest loginRequest) {

		final String username = loginRequest.getUsername();
		final String password = loginRequest.getPassword();

		final UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(username, password);

		authenticationManager.authenticate(usernamePasswordAuthenticationToken);

		final AuthenticatedUserDto authenticatedUserDto = userService.findAuthenticatedUserByUsername(username);

		final User user = UserMapper.INSTANCE.convertToUser(authenticatedUserDto);
		final String token = jwtTokenManager.generateToken(user);

		log.info(" {} has successfully logged in!", user.getUsername());

		return new LoginResponse(token);
	}

}
