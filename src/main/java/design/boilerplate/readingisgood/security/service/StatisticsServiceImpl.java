package design.boilerplate.readingisgood.security.service;

import design.boilerplate.readingisgood.model.Order;
import design.boilerplate.readingisgood.model.OrderItem;
import design.boilerplate.readingisgood.model.User;
import design.boilerplate.readingisgood.repository.StatisticsRepository;
import design.boilerplate.readingisgood.security.dto.StatisticsResponse;
import design.boilerplate.readingisgood.security.utils.DateUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * Created on Ağustos, 2021
 *
 * @author abdurrahman.kolsuz
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class StatisticsServiceImpl implements StatisticsService {

    private final StatisticsRepository statisticsRepository;


    @Override
    public StatisticsResponse getStatistics(User user, int month, int year) {

        LocalDateTime firstDate = DateUtils.getFirstDateOfMonth(year, month);
        LocalDateTime lastDate = DateUtils.getLastDateOfMonth(year, month);

        List<Order> orderList = statisticsRepository.findByUserAndAllByCreatedDateAfterAndCreatedDateBefore(user, firstDate, lastDate);

        StatisticsResponse statisticsResponse = new StatisticsResponse();
        statisticsResponse.setTotalOrderCount(orderList.size());
        List<OrderItem> orderItems = new ArrayList<>();
        for (Order order : orderList
        ) {
            orderItems.addAll(order.getOrderItems());
        }
        statisticsResponse.setTotalBookCount(orderItems.stream().mapToInt(o -> o.getQuantity()).sum());
        statisticsResponse.setTotalPurchasedAmount(orderList.stream().mapToDouble(o -> o.getTotalPrice()).sum());

        return statisticsResponse;

    }
}