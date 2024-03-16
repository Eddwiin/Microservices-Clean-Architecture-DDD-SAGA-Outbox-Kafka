package org.food.ordering.system.domain.event.publish;

import org.food.ordering.system.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent<T>> {
    void publish(T domainEvent);
}
