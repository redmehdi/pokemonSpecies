import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PokemonApplication.class}) // the actual configuration
public class TestApplication {


}