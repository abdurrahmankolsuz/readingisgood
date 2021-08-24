package design.boilerplate.readingisgood.security.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BookRequest {

	@NotEmpty(message = "{book_title_not_empty}")
	private String title;

	@NotEmpty(message = "{book_author_not_empty}")
	private String author;

	@NotEmpty(message = "{book_stock_not_empty}")
	private Integer stock;


}
