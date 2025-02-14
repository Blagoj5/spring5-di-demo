package guru.springframework.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 5/24/17.
 */
@Component
@Primary
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {

        return "Primärer Grußdienst";

    }
}
