import Animals.Fish;
import Places.*;
import Behaviors.*;
import Unils.Utils;

import java.util.ArrayList;
public class mainzoo {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo();
        myZoo.places = new ArrayList<>() {
            {
                add(new Aquarium(10, new PlaceBehaviors.Predator())) ;
                add(new Voliere(1, new PlaceBehaviors.Herbaceous())) ;
            }
        };
        myZoo.places.get(0).showAllAnimal();
        myZoo.places.get(0).addNewAnimal(new Fish(new Predator(), 10));
        myZoo.places.get(0).addNewAnimal(new Fish(new Predator(), 100));
        myZoo.places.get(0).showAllAnimal();

        myZoo.places.get(0).addNewAnimal(new Fish(new Herbaceous(), 100));

        System.out.println(myZoo.calculateAllAnimalsFoodExpenses());
    }
}