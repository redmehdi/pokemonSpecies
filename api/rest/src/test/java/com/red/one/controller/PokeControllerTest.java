package com.red.one.controller;

import com.red.one.controller.dtos.PokeSpeciesDto;
import com.red.one.controller.mappers.PokeDtoMapper;
import com.red.one.controller.mappers.PokeDtoMapperImpl;
import com.red.one.domain.entities.PokeSpecies;
import com.red.one.domain.services.PokeService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokeControllerTest extends BaseTest {

    @Mock
    private PokeService service;

    @Spy
    private PokeDtoMapper mapper = new PokeDtoMapperImpl();

    @InjectMocks
    private PokeController controller;

    @Test
    public void testGetTop5ByHeight_whenExistsData_shouldCallService() throws Exception {
        final PokeSpecies[] expected = PokeDtoDataset.getSpecies();
        mockGetTop5ByHeight(Arrays.asList(expected));

        controller.getTop5ByHeight();

        Mockito.verify(this.service, Mockito.times(1))
                .getTop5ByHeight();
        Mockito.verifyNoMoreInteractions(this.service);
    }

    @Test
    public void testGetTop5ByHeight_whenExistsData_shouldCallMapper() throws Exception {
        final PokeSpecies[] expected = PokeDtoDataset.getSpecies();
        mockGetTop5ByHeight(Arrays.asList(expected));

        controller.getTop5ByHeight();

        Mockito.verify(this.mapper, Mockito.times(5))
                .map(Mockito.any(PokeSpecies.class));
    }

    @Test
    public void testGetTop5ByHeight_whenExistsData_shouldExpectedValues() throws Exception {
        final PokeSpecies[] expected = PokeDtoDataset.getSpecies();
        final List<PokeSpecies> expectedList = Arrays.asList(expected);
        mockGetTop5ByHeight(expectedList);

        final List<PokeSpeciesDto> result = controller.getTop5ByHeight();

        Assertions.assertNotNull(result);
        Assertions.assertEquals(expectedList.size(), result.size());
    }

    @Test
    public void testGetTop5ByHeight_whenEmpty_shouldCallExpectedValues() throws Exception {
        mockGetTop5ByHeight(Collections.EMPTY_LIST);

        final List<PokeSpeciesDto> result = controller.getTop5ByHeight();

        Assertions.assertEquals(Collections.EMPTY_LIST, result);
    }

    private void mockGetTop5ByHeight(final List<PokeSpecies> expected) {
        Mockito.when(service.getTop5ByHeight()).thenReturn(expected);
    }

    //The same for other operations
}