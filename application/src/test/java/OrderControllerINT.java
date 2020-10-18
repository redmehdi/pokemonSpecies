import com.red.one.entities.PokeSpeciesEntity;
import com.red.one.repositories.PokeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TestApplication.class)
@ActiveProfiles(value = "test")
@AutoConfigureMockMvc
public class OrderControllerINT {

    @Autowired
    private EntityManager em;

    @Test
    @Transactional
    public void test(){
        PokeSpeciesEntity pokeSpeciesEntity = new PokeSpeciesEntity("red","Red1", "test", "eee", null);
        em.persist(pokeSpeciesEntity);

    }
}
