package io.zipcoder.interfaces;

public class Students extends People {



    private static Students ourInstance = new Students();

    public static Students getInstance() {
        return ourInstance;
    }

    private Students() {
    }
}
