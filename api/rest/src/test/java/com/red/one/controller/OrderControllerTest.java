package com.red.one.controller;

import com.red.one.controller.dtos.PokeSpeciesDto;
import com.red.one.controller.mappers.PokeDtoMapper;
import com.red.one.domain.entities.PokeSpecies;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class OrderControllerTest extends BaseTest{

    /**
    @Mock
    private OrderService orderService;

    @Mock
    private PokeDtoMapper pokeDtoMapper;

    @InjectMocks
    private OrderController orderController;

    @Test
    public void testCreateOrder_whenExistsData_shouldCallService() throws Exception {
        final DishDto expectedDto = OrderDtoDataset.getDishDto();
        final PokeSpeciesDto expectedPokeSpeciesDto = OrderDtoDataset.getOrderDto(expectedDto.getId());
        final Order expectedOrder = OrderDtoDataset.getOrder(expectedDto.getId());
        final PokeSpecies Expected = OrderDtoDataset.getDish();

        mockMapDishToApi(Expected);
        mockCreateOrder(Mono.just(expectedOrder));
        mockMapOrderToApi(expectedPokeSpeciesDto);


        orderController.create(expectedDto).block();


        // Mocks verifying
        Mockito.verify(this.orderService, Mockito.times(1))
                .createOrder(Mockito.any(PokeSpecies.class));
        Mockito.verifyNoMoreInteractions(this.orderService);
    }

    @Test
    public void testCreateOrder_whenExistsData_shouldReturnExpectedValues() throws Exception {
        final DishDto expectedDto = OrderDtoDataset.getDishDto();
        final PokeSpeciesDto expectedPokeSpeciesDto = OrderDtoDataset.getOrderDto(expectedDto.getId());
        final Order expectedOrder = OrderDtoDataset.getOrder(expectedDto.getId());
        final PokeSpecies Expected = OrderDtoDataset.getDish();

        mockMapDishToApi(Expected);
        mockCreateOrder(Mono.just(expectedOrder));
        mockMapOrderToApi(expectedPokeSpeciesDto);


        Mono<PokeSpeciesDto> result = orderController.create(expectedDto);


        StepVerifier
                .create(result)
                .expectNext(expectedPokeSpeciesDto)
                .expectComplete()
                .verify();
    }

    private void mockMapDishToApi(PokeSpecies expected) {
        Mockito.when(pokeDtoMapper.map(Mockito.any(DishDto.class))).thenReturn(expected);
    }

    private void mockCreateOrder(Mono<Order> expected) {
        Mockito.when(orderService.createOrder(Mockito.any(PokeSpecies.class))).thenReturn(expected);
    }

    private void mockMapOrderToApi(PokeSpeciesDto expected) {
        Mockito.when(pokeDtoMapper.map(Mockito.any(Order.class))).thenReturn(expected);
    }*/
}