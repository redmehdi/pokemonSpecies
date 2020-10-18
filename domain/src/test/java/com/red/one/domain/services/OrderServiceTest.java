package com.red.one.domain.services;

import com.red.one.domain.entities.PokeSpecies;
import com.red.one.domain.exception.DomainException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class OrderServiceTest {

    /**@Mock
    private OrderPort port;

    @InjectMocks
    private OrderService service;

    @Before
    public void onBefore() throws Exception {
        MockitoAnnotations.initMocks(this);
        setUp();
    }

    public void setUp() throws Exception {
        // Method implemented when required
    }

    @Test
    public void addOrder_whenNotNull_shouldExpectedValue() {
        final Order expected = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.CREATED, 1L);
        mockFindBy(Mono.just(expected));
        mockSave(Mono.just(expected));
        final PokeSpecies pokeSpecies = OrderDataset.getDish();

        final Mono<Order> result = service.add(expected.getId(), pokeSpecies);

        StepVerifier
                .create(result)
                .expectNextMatches(order ->
                        order.getId().equals(expected.getId()) &&
                                order.getTotal().equals(expected.getTotal()) &&
                                order.getStatus().equals(expected.getStatus()) &&
                                order.getOrderItems().size() == 1)
                .expectComplete()
                .verify();
    }

    @Test
    public void cancelOrder_whenLess30s_shouldExpectedValue() {
        final Order expected = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.CREATED,1L);
        expected.setModifiedAt(LocalTime.now().plusSeconds(5));
        mockFindBy(Mono.just(expected));
        mockSave(Mono.just(expected));

        final Mono<Order> result = service.cancel(expected.getId());

        StepVerifier
                .create(result)
                .expectNextMatches(order ->
                        order.getId().equals(expected.getId()) &&
                                order.getTotal().equals(expected.getTotal()) &&
                                order.getStatus().equals(OrderStatus.CANCELED))
                .expectComplete()
                .verify();
    }

    @Test
    public void cancelOrder_whenGreater30s_shouldCallException() {
        final Order expected = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.CREATED,1L);
        expected.setModifiedAt(LocalTime.now().plusSeconds(31));
        mockFindBy(Mono.just(expected));
        mockSave(Mono.just(expected));

        final Mono<Order> result = service.cancel(expected.getId());

        StepVerifier
                .create(result)
                .expectErrorMatches(throwable -> throwable instanceof DomainException)
                .verify();
    }

    @Test
    public void cancelOrder_whenIgual30s_shouldExpectValues() {
        final Order expected = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.CREATED,1L);
        expected.setModifiedAt(LocalTime.now().plusSeconds(30));
        mockFindBy(Mono.just(expected));
        mockSave(Mono.just(expected));

        final Mono<Order> result = service.cancel(expected.getId());

        StepVerifier
                .create(result)
                .expectNextMatches(order ->
                        order.getId().equals(expected.getId()) &&
                                order.getTotal().equals(expected.getTotal()) &&
                                order.getStatus().equals(OrderStatus.CANCELED))
                .expectComplete()
                .verify();
    }

    @Test
    public void addOrder_whenCompletedStatus_shouldExpectException() {
        final Order expected = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.COMPLETED, 1L);
        mockFindBy(Mono.just(expected));
        mockSave(Mono.just(expected));
        final PokeSpecies pokeSpecies = OrderDataset.getDish();

        final Mono<Order> result = service.add(expected.getId(), pokeSpecies);

        StepVerifier
                .create(result)
                .expectErrorMatches(throwable -> throwable instanceof DomainException)
                .verify();
    }

    private void mockFindBy(final Mono<Order> entity) {
        when(port.findById(any(UUID.class))).thenReturn(entity);
    }

    private void mockSave(final Mono<Order> entity) {
        when(port.save(any(Order.class))).thenReturn(entity);
    }*/
}