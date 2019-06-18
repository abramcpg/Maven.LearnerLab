package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;


public class PersonTest {



    @Test
    public void testConstructor(){
        //Given
        String expectedName = "Abram";
        Long expectedId = 10L;

        //When
        Person person = new Person (expectedId, expectedName);

        //Then
        Assert.assertEquals(expectedId, person.getId());
        Assert.assertEquals(expectedName, person.getName());
    }
     @Test
    public void testSetName() {
         //Given
         Person person = new Person(0L, null);
         String expectedName = "Jonah";

         //When
         person.setName(expectedName);

         //Then
         Assert.assertEquals(expectedName, person.getName());
     }


}
