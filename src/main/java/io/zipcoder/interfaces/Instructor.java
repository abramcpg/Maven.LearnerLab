package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, Double numberOfHours) {

        for (Learner each: learners){
            each.learn(numberOfHours/learners.length);
        }
    }

}