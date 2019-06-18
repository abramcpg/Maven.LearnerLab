package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private Double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    public Double getTotalStudyTime() { return totalStudyTime; }

    public void learn(Double numberOfHours) {
        totalStudyTime = numberOfHours;
    }
}