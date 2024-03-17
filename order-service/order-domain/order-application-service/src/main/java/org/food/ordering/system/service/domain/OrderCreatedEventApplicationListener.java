package org.food.ordering.system.service.domain;

import lombok.extern.slf4j.Slf4j;
import org.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import org.food.ordering.system.service.domain.ports.output.message.publish.payment.OrderCreatedPaymentRequestMessagePublisher;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class OrderCreatedEventApplicationListener {
    private final OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher;

    public OrderCreatedEventApplicationListener(OrderCreatedPaymentRequestMessagePublisher orderCreatedPaymentRequestMessagePublisher) {
        this.orderCreatedPaymentRequestMessagePublisher = orderCreatedPaymentRequestMessagePublisher;
    }

    @TransactionalEventListener
    void process(OrderCreatedEvent orderCreatedEvent) {

    }
}
