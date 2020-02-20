package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`



    @Test
    public void addDogTest() {
        Integer expectedNumberOfDogs= 2;

       DogHouse.add(new Dog(null, null, null));
        Integer actualNumberOfDogs = DogHouse.getNumberOfDogs();


        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }
    @Test
    public void removeDogTest() {
        Integer givenId = 1;
        Dog expectedDog = new Dog(null, null, null);

       DogHouse.add(expectedDog);
       DogHouse.remove(expectedDog);


        Assert.assertNull(DogHouse.getDogById(givenId));
    }
    @Test
    public void getDogByIdTest() {

        Integer givenId = 1;
        Dog expectedDog = new Dog(null, null, givenId);
        DogHouse.clear();
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(givenId);
        Assert.assertEquals(expectedDog, actualDog);
    }




@Test
    public void testGetNumberOfDogs() {
        String name = "Feddy";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        DogHouse.add(animal);

        DogHouse.getNumberOfDogs();
}
}

