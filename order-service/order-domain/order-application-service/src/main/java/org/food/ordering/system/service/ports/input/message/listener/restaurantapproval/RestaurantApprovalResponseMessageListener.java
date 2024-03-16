package org.food.ordering.system.service.ports.input.message.listener.restaurantapproval;

import org.food.ordering.system.service.domain.dto.message.ResturantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(ResturantApprovalResponse resturantApprovalResponse);
    void orderRejected(ResturantApprovalResponse resturantApprovalResponse);
}
