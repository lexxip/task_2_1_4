package app.config;

import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "animalCage")
    public List<Animal> animalsCage() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        return animals;
    }

    @Bean(name = "Timer")
    public Timer timer() {
        return new Timer();
    }

}
