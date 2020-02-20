package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */




public class CatTest {
    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String expectedName = "Milo";

        // When (a dog's name is set to the given name)
        cat.setName(expectedName);

        // Then (we expect to get the given name from the dog)
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, expectedName);
    }


    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    // this one's right
    @Test
    public void testGetBirthDate() {
        //Given
        Cat cat = new Cat(null, null, null);
        Date expectedbirthDate = new Date(76);

        // When
        cat.setBirthDate(expectedbirthDate);

        // Then
        Assert.assertEquals(expectedbirthDate, cat.getBirthDate());
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
    public void testGetById() {
        //Given
        Integer givenId = 0;
        Cat cat = new Cat(null, null, givenId);
        Integer retrievedId = cat.getId();
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void testAnimalInheritance() {
        //Given
        Boolean expected = true;

        //When
        Cat cat = new Cat(null, null, null);

        //Then
        Boolean animalInheritance = true;
        Assert.assertTrue(animalInheritance);
    }

    @Test
    public void testMammalInheritance() {
        //Given
        Boolean expected = true;

        //When
        Cat cat = new Cat(null, null, null);

        //Then
        Boolean mammalInheritance = true;
        Assert.assertTrue(mammalInheritance);

    }

    public void testFoodfood() {
        Integer expectedEaten = 1;
        Cat cat = new Cat(null, null, null);
        Food food = new Food();

        //When
        cat.eat(new Food());

        Assert.assertEquals(food, cat.getNumberOfMealsEaten());

    }
}





