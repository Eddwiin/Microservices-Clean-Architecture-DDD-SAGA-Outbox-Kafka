package org.food.ordering.system.service.domain;

import org.food.ordering.system.service.domain.ports.output.message.publish.payment.OrderCancelledPaymentRequestMessagePublisher;
import org.food.ordering.system.service.domain.ports.output.message.publish.payment.OrderCreatedPaymentRequestMessagePublisher;
import org.food.ordering.system.service.domain.ports.output.message.publish.restaurantApproval.OrderPaidRestaurantRequestMessagePublisher;
import org.food.ordering.system.service.domain.ports.output.repository.CustomerRepository;
import org.food.ordering.system.service.domain.ports.output.repository.OrderRepository;
import org.food.ordering.system.service.domain.ports.output.repository.RestaurantRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.mockito.Mockito;

@SpringBootApplication(scanBasePackages = "org.food.ordering.system")
public class OrderTestConfiguration {

    @Bean
    public OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher() {
        return Mockito.mock(OrderCreatedPaymentRequestMessagePublisher.class);
    }

//    @Bean
//    public OrderCancelledPaymentRequestMessagePublisher orderCancelledPaymentRequestMessagePublisher() {
//        return Mockito.mock(OrderCancelledPaymentRequestMessagePublisher.class);
//    }
//
//    @Bean
//    public OrderPaidRestaurantRequestMessagePublisher orderPaidRestaurantRequestMessagePublisher() {
//        return Mockito.mock(OrderPaidRestaurantRequestMessagePublisher.class);
//    }
//
//    @Bean
//    public OrderRepository orderRepository() {
//        return Mockito.mock(OrderRepository.class);
//    }
//
//    @Bean
//    public CustomerRepository customerRepository() {
//        return Mockito.mock(CustomerRepository.class);
//    }
//
//    @Bean
//    public RestaurantRepository restaurantRepository() {
//        return Mockito.mock(RestaurantRepository.class);
//    }
}
