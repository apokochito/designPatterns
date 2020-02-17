package com.java.patterns;

public class Eager {

    private static final Eager instance = new Eager();

    private Eager() {
    }

    public static Eager getInstance() {
        try {
            if (instance != null) {
                return instance;
            } else {
                Eager newInstance = new Eager();
                return newInstance;
            }
        } catch (Exception ex) {
            throw new RuntimeException("Exception occured in creating singleton instace");
        }
    }
}
