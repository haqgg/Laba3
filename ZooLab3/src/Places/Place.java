package Places;


import Animals.Animal;
import PlaceBehaviors.Behavior;

import java.util.ArrayList;

public abstract class Place {
    static int counter;
    int id;

    Integer placeCapacity;
    Behavior behavior;
    ArrayList<Animal> animals = new ArrayList<>();

    public Integer getPlaceCapacity() {
        return placeCapacity;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public Place(Integer placeCapacity, Behavior behavior) {
        this.placeCapacity = placeCapacity;
        this.behavior = behavior;
        id = ++counter;
    }

    public void addNewAnimal(Animal animal) {
        if (addCheck(animal))
            animals.add(animal);
    }

    public void showAllAnimal(){
        for (var item : animals) {
            System.out.println(item.toString());
        }
    }

    private boolean addCheck(Animal animal){
        if(animals.size()+1 > placeCapacity) {
            System.out.println("Overflow");
            return false;
        }
        if(behavior.behaviors.contains(animal.getBehavior())){
            System.out.println("Successful");
            return true;
        }
        System.out.println("You tried to add animal with another behavior");
        return false;
    }
}
