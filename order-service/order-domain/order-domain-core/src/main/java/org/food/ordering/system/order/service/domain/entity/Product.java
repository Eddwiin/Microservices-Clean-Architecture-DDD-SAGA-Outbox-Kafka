package org.food.ordering.system.order.service.domain.entity;

import org.food.ordering.system.domain.entities.BaseEntity;
import org.food.ordering.system.domain.valueObject.Money;
import org.food.ordering.system.domain.valueObject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private final String name;
    private final Money price;

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
