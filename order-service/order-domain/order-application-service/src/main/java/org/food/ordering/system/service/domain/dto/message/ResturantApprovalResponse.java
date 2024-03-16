package org.food.ordering.system.service.domain.dto.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.food.ordering.system.domain.valueObject.OrderApprovalStatus;

import java.time.Instant;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class ResturantApprovalResponse {
    private String id;
    private String sageId;
    private String orderId;
    private String restaurantId;
    private Instant createAt;
    private OrderApprovalStatus orderApprovalStatus;
    private List<String> failureMessages;
}
