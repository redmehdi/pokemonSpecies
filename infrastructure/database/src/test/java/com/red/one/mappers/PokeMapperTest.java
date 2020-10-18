package com.red.one.mappers;

public class PokeMapperTest {

    /**private OrderMapper mapper = new OrderMapperImpl();


    @Test
    public void mapToEntity_whenNull_shouldReturnNull() {
        final OrderEntity result = mapper.map((Order) null);

        assertNull(result);
    }

    @Test
    public void mapToDomain_whenNull_shouldReturnNull() {
        final Order result = mapper.map((OrderEntity) null);

        assertNull(result);
    }

    @Test
    public void mapToPersistence_whenNullParamsNewOrder_shouldReturnNull() {
        Order domain = new Order(null, (List<OrderItem>) null);
        final OrderEntity result = mapper.map(domain);

        assertNotNull(result);
        assertNull(result.getOrderItems());
        assertNull(result.getId());
        assertNotNull(result.getStatus());
        assertNull(result.getTotal());
    }

    @Test
    public void mapToPersistence_whenNullParamsNewOrderWithOnlyOne_shouldReturnNull() {
        Order domain = new Order(null, (OrderItem) null);
        final OrderEntity result = mapper.map(domain);

        assertNotNull(result);
        assertNotNull(result.getOrderItems());
        assertNull(result.getOrderItems().get(0));
        assertNull(result.getId());
        assertNotNull(result.getStatus());
        assertNull(result.getTotal());
    }

    @Test
    public void mapToPersistence_whenFullNullParams_shouldReturnNull() {
        final OrderEntity result = mapper.map(OrderDataset.getOrder(null, null, null, null));

        assertNotNull(result);
        assertNull(result.getOrderItems());
        assertNull(result.getId());
        assertNull(result.getStatus());
        assertNull(result.getTotal());
    }

    @Test
    public void mapToPersistence_whenOrderItemExist_shouldReturnNull() {
        UUID orderId = UUID.randomUUID();
        UUID dishId = UUID.randomUUID();
        long quantityExpected = 1L;
        OrderItem orderItemExpected = new OrderItem(orderId, dishId, quantityExpected);
        final OrderEntity result = mapper.map(OrderDataset.getOrder(null, Arrays.asList(orderItemExpected), OrderStatus.COMPLETED, null));

        assertNotNull(result);
        List<OrderItemEntity> orderItems = result.getOrderItems();
        assertNotNull(orderItems);
        OrderItemEntity orderItem = orderItems.get(0);
        assertNotNull(orderItem);
        assertNotNull(String.valueOf(dishId), orderItem.getDishId());
        assertNotNull(String.valueOf(orderId), orderItem.getOrderId());
        assertNotNull(String.valueOf(quantityExpected), orderItem.getQuantity());
        assertNull(result.getId());
        assertEquals(OrderStatus.COMPLETED, result.getStatus());
        assertNull(result.getTotal());
    }

    @Test
    public void mapToPersistence_whenIdExist_shouldReturnNull() {
        final OrderEntity result = mapper.map(OrderDataset.getOrder(UUID.randomUUID(), null, null, null));

        assertNotNull(result);
        assertNull(result.getOrderItems());
        assertNotNull(result.getId());
        assertNull(result.getStatus());
        assertNull(result.getTotal());
    }

    @Test
    public void mapToDomain_whenNullParams_shouldReturnNull() {
        final Order result = mapper.map(new OrderEntity(null, null, null, null));

        assertNotNull(result);
        assertNull(result.getOrderItems());
        assertNull(result.getId());
        assertNull(result.getStatus());
        assertNull(result.getTotal());
    }*/
}