package Day34_AbstractionAndInterface;


import Day34_AbstractionAndInterface.animalTask.Playable;
import Day34_AbstractionAndInterface.animalTask.Swimmable;

public class Person implements Swimmable, Playable {
    @Override
    public void play() {

    }

    @Override
    public void swim() {

    }
}