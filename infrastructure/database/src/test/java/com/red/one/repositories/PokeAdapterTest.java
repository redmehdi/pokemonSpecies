package com.red.one.repositories;

import com.red.one.PokeDataset;
import com.red.one.domain.entities.PokeSpecies;
import com.red.one.entities.PokeSpeciesEntity;
import com.red.one.mappers.PokeMapper;
import com.red.one.mappers.PokeMapperImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PokeAdapterTest {
    @Mock
    private PokeRepository repository;

    @Spy
    private PokeMapper mapper = new PokeMapperImpl();

    @InjectMocks
    private PokeAdapter port;

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
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        int expectedSize = expectedEntities.length;
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByHeight(values);

        final List<PokeSpecies> result = port.findTop5ByHeight();

        Assertions.assertNotNull(result);
        Assert.assertTrue(result.size() == expectedSize);
    }

    @Test
    public void findTop5ByHeight_whenNotNull_shouldExpectedValues() {
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByHeight(values);

        final List<PokeSpecies> result = port.findTop5ByHeight();

        Assertions.assertNotNull(result);
        PokeSpecies pokeSpecies = result.get(0);
        Assert.assertNull(pokeSpecies.getId());
        Assert.assertEquals(expectedEntities[0].getColor(), pokeSpecies.getColor());
        Assert.assertEquals(expectedEntities[0].getName(), pokeSpecies.getName());
    }

    @Test
    public void findTop5ByHeight_whenNull_shouldExpectedEmptyList() {
        mockFindTop5ByHeight(Collections.EMPTY_LIST);

        final List<PokeSpecies> result = port.findTop5ByHeight();

        Assertions.assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void findTop5ByHeight_whenNotNull_shouldCallOnceRepository() {
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByHeight(values);

        final List<PokeSpecies> result = port.findTop5ByHeight();

        Assertions.assertNotNull(result);
        Mockito.verify(repository, Mockito.times(1)).findTop5ByHeight();
        Mockito.verify(repository, Mockito.never()).findTop5ByWeight();
        Mockito.verify(repository, Mockito.never()).findTop5ByBaseExperience();
    }

    @Test(expected = RuntimeException.class)
    public void findTop5ByHeight_whenNotNull_shouldExpectedException() {
        mockFindTop5ByHeight(new RuntimeException());

        port.findTop5ByHeight();
    }

    @Test
    public void findTop5ByHeight_whenNotNull_shouldCall5TimesMapper() {
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        final int expectedSize = expectedEntities.length;
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByHeight(values);

        final List<PokeSpecies> result = port.findTop5ByHeight();

        Assertions.assertNotNull(result);
        Mockito.verify(mapper, Mockito.times(expectedSize)).map(Mockito.any(PokeSpeciesEntity.class));
        Mockito.verify(repository, Mockito.never()).findTop5ByWeight();
        Mockito.verify(repository, Mockito.never()).findTop5ByBaseExperience();
    }

    @Test
    public void findTop5ByWeight_whenNotNull_shouldExpectedSize() {
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        int expectedSize = expectedEntities.length;
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByWeight(values);

        final List<PokeSpecies> result = port.findTop5ByWeight();

        Assertions.assertNotNull(result);
        Assert.assertTrue(result.size() == expectedSize);
    }

    @Test
    public void findTop5ByWeight_whenNotNull_shouldExpectedValues() {
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByWeight(values);

        final List<PokeSpecies> result = port.findTop5ByWeight();

        Assertions.assertNotNull(result);
        PokeSpecies pokeSpecies = result.get(0);
        Assert.assertNull(pokeSpecies.getId());
        Assert.assertEquals(expectedEntities[0].getColor(), pokeSpecies.getColor());
        Assert.assertEquals(expectedEntities[0].getName(), pokeSpecies.getName());
    }

    @Test
    public void findTop5ByWeight_whenNull_shouldExpectedEmptyList() {
        mockFindTop5ByWeight(Collections.EMPTY_LIST);

        final List<PokeSpecies> result = port.findTop5ByWeight();

        Assertions.assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void findTop5ByWeight_whenNotNull_shouldCallOnceRepository() {
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByWeight(values);

        final List<PokeSpecies> result = port.findTop5ByWeight();

        Assertions.assertNotNull(result);
        Mockito.verify(repository, Mockito.times(1)).findTop5ByWeight();
        Mockito.verify(repository, Mockito.never()).findTop5ByHeight();
        Mockito.verify(repository, Mockito.never()).findTop5ByBaseExperience();
    }

    @Test(expected = RuntimeException.class)
    public void findTop5ByWeight_whenNotNull_shouldExpectedException() {
        mockFindTop5ByWeight(new RuntimeException());

        port.findTop5ByWeight();
    }

    @Test
    public void findTop5ByWeight_whenNotNull_shouldCall5TimesMapper() {
        final PokeSpeciesEntity[] expectedEntities = PokeDataset.getSpeciesEntity();
        final int expectedSize = expectedEntities.length;
        List<PokeSpeciesEntity> values = Arrays.asList(expectedEntities);
        mockFindTop5ByWeight(values);

        final List<PokeSpecies> result = port.findTop5ByWeight();

        Assertions.assertNotNull(result);
        Mockito.verify(mapper, Mockito.times(expectedSize)).map(Mockito.any(PokeSpeciesEntity.class));
        Mockito.verify(repository, Mockito.never()).findTop5ByHeight();
        Mockito.verify(repository, Mockito.never()).findTop5ByBaseExperience();
    }

    private void mockFindTop5ByHeight(final List<PokeSpeciesEntity> values) {
        Mockito.when(repository.findTop5ByHeight()).thenReturn(values);
    }

    private void mockFindTop5ByHeight(final RuntimeException values) {
        Mockito.when(repository.findTop5ByHeight()).thenThrow(values);
    }

    private void mockFindTop5ByWeight(final List<PokeSpeciesEntity> values) {
        Mockito.when(repository.findTop5ByWeight()).thenReturn(values);
    }

    private void mockFindTop5ByWeight(final RuntimeException values) {
        Mockito.when(repository.findTop5ByWeight()).thenThrow(values);
    }
}