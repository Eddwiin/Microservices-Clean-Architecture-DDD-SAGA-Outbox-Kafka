package org.food.ordering.system.order.service.domain.valueObject;

import org.food.ordering.system.domain.valueObject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
