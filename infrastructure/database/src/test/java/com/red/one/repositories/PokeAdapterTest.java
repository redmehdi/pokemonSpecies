package com.red.one.repositories;

public class PokeAdapterTest {
/**
    @Mock
    private OrderRepository repository;

    @Mock
    private OrderMapper mapper;

    @InjectMocks
    private OrderAdapter port;

    @Before
    public void onBefore() throws Exception {
        MockitoAnnotations.initMocks(this);
        setUp();
    }

    public void setUp() throws Exception {
        // Method implemented when required
    }

    @Test
    public void findById_whenNotNull_shouldExpectedValue() {
        final Order expectedOrder = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.COMPLETED, 1L);
        mockMapperFromPersistence(expectedOrder);

        final OrderEntity expectedEntity = OrderDataset.getOrderEntity(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.COMPLETED, 1L);
        mockFindBy(Mono.just(expectedEntity));


        final Mono<Order> result = port.findById(UUID.randomUUID());

        StepVerifier
                .create(result)
                .expectNext(expectedOrder)
                .expectComplete()
                .verify();
    }

    @Test
    public void findById_whenEmpty_shouldExpectedValue() {
        final Order expectedOrder = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.COMPLETED, 1L);
        mockMapperFromPersistence(expectedOrder);

        mockFindBy(Mono.empty());


        final Mono<Order> result = port.findById(UUID.randomUUID());

        StepVerifier
                .create(result)
                .expectNextCount(0)
                .expectComplete()
                .verify();
    }


    @Test
    public void save_whenNotNull_shouldExpectedValue() {
        final Order expectedOrder = OrderDataset.getOrder(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.COMPLETED, 1L);
        mockMapperFromPersistence(expectedOrder);


        final OrderEntity expectedEntity = OrderDataset.getOrderEntity(UUID.randomUUID(),
                new ArrayList<>(), OrderStatus.COMPLETED, 1L);
        mockMapperToPersistence(expectedEntity);
        mockSave(Mono.just(expectedEntity));


        final Mono<Order> result = port.save(expectedOrder);

        StepVerifier
                .create(result)
                .expectNext(expectedOrder)
                .expectComplete()
                .verify();
    }

    private void mockMapperFromPersistence(final Order order) {
        when(mapper.map(any(OrderEntity.class))).thenReturn(order);
    }

    private void mockMapperToPersistence(final OrderEntity order) {
        when(mapper.map(any(Order.class))).thenReturn(order);
    }

    private void mockFindBy(final Mono<OrderEntity> entity) {
        when(repository.findById(any(UUID.class)))
                .thenReturn(entity);
    }

    private void mockSave(final Mono<OrderEntity> entity) {
        when(repository.save(any(OrderEntity.class)))
                .thenReturn(entity);
    }*/
}