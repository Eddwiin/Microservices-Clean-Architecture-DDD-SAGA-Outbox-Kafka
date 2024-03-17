package org.food.ordering.system;

import lombok.extern.slf4j.Slf4j;
import org.food.ordering.system.service.domain.dto.message.ResturantApprovalResponse;
import org.food.ordering.system.service.domain.ports.input.message.listener.restaurantapproval.RestaurantApprovalResponseMessageListener;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class RestaurantApprovalMessageListenerImpl implements RestaurantApprovalResponseMessageListener {
    @Override
    public void orderApproved(ResturantApprovalResponse resturantApprovalResponse) {

    }

    @Override
    public void orderRejected(ResturantApprovalResponse resturantApprovalResponse) {

    }
}
