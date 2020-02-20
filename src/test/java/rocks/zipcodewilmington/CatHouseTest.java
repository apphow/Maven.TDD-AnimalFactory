package rocks.zipcodewilmington;

import com.sun.tools.javac.comp.Resolve;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import sun.lwawt.LWWindowPeer;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test
    public void addCatTest() {
        Integer expectedNumberOfCats = 1;

        CatHouse.add(new Cat(null, null, null));
        Integer actualNumberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void removeCatTest() {
        Integer givenId = 1;
        Cat Cat = new Cat(null, null, null);
        CatHouse.clear();
        CatHouse.add(Cat);
        CatHouse.remove(Cat);
        Assert.assertNull(CatHouse.getCatById(givenId));
    }

    @Test
    public void getCatByIdTest() {

        Integer givenId = 1;
        CatHouse.clear();
        CatHouse.add(new Cat(null, null, null));

        Integer actualCats =CatHouse.getNumberOfCats();

        Assert.assertEquals(givenId, actualCats);

    }

    @Test
    public void getNumberOfCatsTest() {
        Integer expected = 1;
        CatHouse.clear();
        CatHouse.add(new Cat(null, null, null));
        Integer actualCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actualCats);

    }
}








    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


