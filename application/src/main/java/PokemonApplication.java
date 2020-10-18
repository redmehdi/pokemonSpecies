import com.red.one.domain.services.IPokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.red.one.repositories")
@ComponentScan(basePackages = {"com.red.one"})
@EntityScan("com.red.one.entities")
public class PokemonApplication {

    @Autowired
    private IPokeService iPokeService;
    public static void main(String[] args) {
        SpringApplication.run(PokemonApplication.class, args);
    }
}
