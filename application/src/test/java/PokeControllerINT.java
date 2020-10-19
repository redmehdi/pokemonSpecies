import com.red.one.entities.PokeCharacterEntity;
import com.red.one.entities.PokeSpeciesEntity;
import com.red.one.repositories.PokeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TestApplication.class)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
public class PokeControllerINT {

    @Autowired
    private PokeRepository repository;

    @Test
    public void test(){
        PokeCharacterEntity pokeCharacterEntity = new PokeCharacterEntity("name1", 56,34,23,null);
        PokeSpeciesEntity pokeSpeciesEntity = new PokeSpeciesEntity("red","Red1", "test", "eee", pokeCharacterEntity);
        PokeCharacterEntity pokeCharacterEntity1 = new PokeCharacterEntity("name1", 56,34,23,null);
pokeCharacterEntity.setSpecies(pokeSpeciesEntity);
        PokeSpeciesEntity pokeSpeciesEntity1 = new PokeSpeciesEntity("red","Red1", "test", "eee", pokeCharacterEntity1);
        PokeCharacterEntity pokeCharacterEntity2 = new PokeCharacterEntity("name1", 56,34,23,null);

        pokeCharacterEntity1.setSpecies(pokeSpeciesEntity1);

        PokeSpeciesEntity pokeSpeciesEntity2 = new PokeSpeciesEntity("red","Red1", "test", "eee", pokeCharacterEntity2);
        pokeCharacterEntity2.setSpecies(pokeSpeciesEntity2);

        PokeCharacterEntity pokeCharacterEntity3 = new PokeCharacterEntity("name1", 56,34,23,null);


        PokeSpeciesEntity pokeSpeciesEntity3 = new PokeSpeciesEntity("red","Red1", "test", "eee", pokeCharacterEntity3);

        pokeCharacterEntity3.setSpecies(pokeSpeciesEntity3);

        repository.save(pokeSpeciesEntity);
        repository.save(pokeSpeciesEntity1);
        repository.save(pokeSpeciesEntity2);
        repository.save(pokeSpeciesEntity3);

        System.out.println(repository.findTop5ByHeight());

    }
}
