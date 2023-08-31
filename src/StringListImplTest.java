import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {
private final StringListImpl stringList =new StringListImpl();

    @Test
    void add() {
        String actual = stringList.add("Вася");
        String expected = "Вася";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void testAdd() {
        String actual = stringList.add(0,"Вася");
        String expected = "Вася";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void set() {
        String actual = stringList.set(0,"Вася");
        String expected = "Вася";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void remove() {
        stringList.add("Вася");
        String actual = stringList.remove("Вася");
        String expected = "Вася";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void testRemove() {
        stringList.add("Петя");
        String actual = stringList.remove(0);
        String expected = "Петя";
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void contains() {
        stringList.add("Петя");
        boolean actual = stringList.contains("Петя");
        boolean expected = true;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void indexOf() {
        stringList.add("Петя");
        int actual = stringList.indexOf("Петя");
        int expected = 0;
        Assertions.assertEquals(actual,expected);

    }

    @Test
    void lastIndexOf() {
        stringList.add("Петя");
        int actual = stringList.lastIndexOf("Петя");
        int expected = 0;
        Assertions.assertEquals(actual,expected);
    }

    @Test
    void get() {
        stringList.add("Маша");
        String actual = stringList.get(0);
        String expected = "Маша";
        Assertions.assertEquals(actual,expected);

    }


    }
