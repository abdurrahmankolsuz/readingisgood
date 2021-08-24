package design.boilerplate.readingisgood.security.dto;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class StatisticsResponse {

	private Integer totalOrderCount;

	private Integer totalBookCount;

	private Double totalPurchasedAmount;


}
