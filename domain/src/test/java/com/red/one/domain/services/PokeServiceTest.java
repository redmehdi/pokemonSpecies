package com.red.one.domain.services;

import com.red.one.domain.entities.PokeSpecies;
import com.red.one.domain.ports.PokePort;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokeServiceTest {

    @Mock
    private PokePort port;

    @InjectMocks
    private PokeService service;

    @Before
    public void onBefore() throws Exception {
        MockitoAnnotations.initMocks(this);
        setUp();
    }

    public void setUp() throws Exception {
        // Method implemented when required
    }

    @Test
    public void findTop5ByHeight_whenNotNull_shouldExpectedSize() {
        final PokeSpecies[] expectedDomain = PokeDataset.getSpecies();
        int expectedSize = expectedDomain.length;
        List<PokeSpecies> values = Arrays.asList(expectedDomain);
        mockFindTop5ByHeight(values);

        final List<PokeSpecies> result = service.getTop5ByHeight();

        Assertions.assertNotNull(result);
        Assert.assertTrue(result.size() == expectedSize);
    }

    private void mockFindTop5ByHeight(final List<PokeSpecies> values) {
        Mockito.when(port.findTop5ByHeight()).thenReturn(values);
    }

    private void mockFindTop5ByHeight(final RuntimeException values) {
        Mockito.when(port.findTop5ByHeight()).thenThrow(values);
    }

    @Test
    public void findTop5ByHeight_whenNotNull_shouldExpectedValues() {
        final PokeSpecies[] expectedDomain = PokeDataset.getSpecies();
        List<PokeSpecies> values = Arrays.asList(expectedDomain);
        mockFindTop5ByHeight(values);

        final List<PokeSpecies> result = service.getTop5ByHeight();

        Assertions.assertNotNull(result);
        PokeSpecies pokeSpecies = result.get(0);
        Assert.assertEquals(expectedDomain[0].getId(), pokeSpecies.getId());
        Assert.assertEquals(expectedDomain[0].getColor(), pokeSpecies.getColor());
        Assert.assertEquals(expectedDomain[0].getName(), pokeSpecies.getName());
    }

    @Test
    public void findTop5ByHeight_whenNull_shouldExpectedEmptyList() {
        mockFindTop5ByHeight(Collections.EMPTY_LIST);

        final List<PokeSpecies> result = service.getTop5ByHeight();

        Assertions.assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void findTop5ByHeight_whenNotNull_shouldCallOnceRepository() {
        final PokeSpecies[] expectedDomain = PokeDataset.getSpecies();
        List<PokeSpecies> values = Arrays.asList(expectedDomain);
        mockFindTop5ByHeight(values);

        final List<PokeSpecies> result = service.getTop5ByHeight();

        Assertions.assertNotNull(result);
        Mockito.verify(port, Mockito.times(1)).findTop5ByHeight();
        Mockito.verify(port, Mockito.never()).findTop5ByWeight();
        Mockito.verify(port, Mockito.never()).findTop5ByBaseExperience();
    }

    @Test(expected = RuntimeException.class)
    public void findTop5ByHeight_whenNotNull_shouldExpectedException() {
        mockFindTop5ByHeight(new RuntimeException());

        service.getTop5ByHeight();
    }

    //The same unit test for findTop5ByWeight and findTop5ByBaseExperience
}