package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 testlab=new SILab2();

    @Test
    void EveryBranch(){
        RuntimeException ex;
        ex= assertThrows(RuntimeException.class,()->testlab.function(null,null));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        List<User> users=new ArrayList<>();
        users.add(new User("Marko","marconi","Marconi123@gmail.com"));
        users.add(new User("Andrej","Hvert","Hvejo@gmail.com"));
        assertFalse(testlab.function(new User("Marko", "marconi", "Marconi123@gmail.com"), users));

        assertFalse(testlab.function(new User("Marko", "lazarevski!@#", "Marko"), users));

        assertFalse(testlab.function(new User("Marko", "lazarevski", "Marko"), users));

        assertFalse(testlab.function(new User("Marko", "laz arevski", "Marko"), users));
    }
    @Test void MultipleConditions(){
        RuntimeException ex2;
        ex2= assertThrows(RuntimeException.class,()->testlab.function(null,null));
        assertTrue(ex2.getMessage().contains("Mandatory information missing!"));

        ex2= assertThrows(RuntimeException.class,()->testlab.function(new User(null,"pas",null),null));
        assertTrue(ex2.getMessage().contains("Mandatory information missing!"));

        assertThrows(RuntimeException.class,()->testlab.function(new User(null,null,"mail"),null));

        assertDoesNotThrow(()->testlab.function(new User("user","pass","mail"),null));

    }


}
