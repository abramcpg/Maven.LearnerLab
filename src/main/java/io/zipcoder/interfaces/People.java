package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class People{

    private List<Person> personList = new ArrayList<Person>();


    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        for (Person person : personList) {
            if (person.getId() == id)
                return person;
        }return null;
    }

    public Boolean containsName(Person person){
        return (personList.contains(person));
    }

    public Boolean remove(Person person){
        return (personList.remove(person));
    }

    public Boolean removeId(long id){
        for (Person person : personList) {
            if (person.getId() == id){
                personList.remove(person);
                return true;
            }
        }
        return false;
    }

    public void clearList(){
        personList.clear();
    }

    public Integer countList(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] output = new Person[personList.size()];
        return personList.toArray(output);
    }

}