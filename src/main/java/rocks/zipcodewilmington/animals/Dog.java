package rocks.zipcodewilmington.animals;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }



}
