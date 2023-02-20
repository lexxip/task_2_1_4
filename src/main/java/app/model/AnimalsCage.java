package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnimalsCage {

    @Autowired
    private List<Animal> animal;
    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return timer;
    }

}
