package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Object Dog;

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testGetBirthDate() {
        //Given
        Dog dog = new Dog(null, null, null);
        Date birthDate = new Date(76);

        // When
        dog.setBirthDate(birthDate);

        // Then
        Assert.assertEquals(birthDate, dog.getBirthDate());
    }

    @Test
    public void testEat() {
        Integer expectedEat = 1;
        Dog dog = new Dog(null, null, null);
        dog.eat(new Food());



        Assert.assertEquals(expectedEat, dog.getNumberOfMealsEaten());



    }

    @Test
    public void testSpeak() {
        //Given
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void getIdTest() {
        //Given
        Integer expectedId = 0;
        Dog dog = new Dog(null, null, expectedId);
        Integer actualId = dog.getId();
        Assert.assertEquals(expectedId, actualId);


    }
    @Test
    public void testAnimalInheritance() {
       Dog dog = new Dog(null, null, null);
       Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void testMammalInheritance() {

        Dog dog = new Dog(null, null, null);
        Assert.assertTrue(dog instanceof Mammal);

    }








}
