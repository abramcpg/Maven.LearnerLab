package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class StudentTest {



    @Test
    public void testImplimentation(){
        Student student = new Student(10L, "Donna");
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(22L, "Jacob");
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student = new Student(44L, "Daniel");
        //Given
        Double numberOfHours = 44d;
        //When
        Double expected = 44d;
        student.learn(numberOfHours);
        //Then
        System.out.println(student.getTotalStudyTime());
        Assert.assertEquals(expected, student.getTotalStudyTime());
    }
}

/*
    @Test
    public void getId3() {
        Person person = new Person(-6, "Abram C.");
        long expected = -6;
        assertEquals(expected, person.getId());
        System.out.println(person.getId());
    }

Create a testImplementation method that asserts that a Student is an instanceof a Learner.
Create a testInheritance method that asserts that a Student is an instanceof a Person.
Create a testLearn method that ensures a Student's totalStudyTime instance variable is
 incremented by the specified numberOfHours by invoking the .learn method.
 */
