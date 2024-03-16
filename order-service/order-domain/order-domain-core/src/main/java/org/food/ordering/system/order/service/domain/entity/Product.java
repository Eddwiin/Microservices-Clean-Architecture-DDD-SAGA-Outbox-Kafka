package org.food.ordering.system.order.service.domain.entity;

import org.food.ordering.system.domain.entities.BaseEntity;
import org.food.ordering.system.domain.valueObject.Money;
import org.food.ordering.system.domain.valueObject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

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

    public void updateWithConfirmenameAndPrice(String name, Money price) {
        this.name = name;
        this.price = price;
    }
}
