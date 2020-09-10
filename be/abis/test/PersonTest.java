package be.abis.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import be.abis.demo.*;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    static Person ptest;

    @BeforeAll
    static void inittest() {
        ptest = new Person("James", "Bond");
    }

    @Test
    void getFirstName() {
        assertEquals("Peter", ptest.getFirstName(), "no: it is not him but his brother");
    }

    @Test
    void getLastName() {
        assertEquals("Bond", ptest.getLastName(), "no: it is not 007");
    }
}