package com.company;

public class App {
    public static void main(String[] args){
        Conference conference = new Conference();
        Conference intelConference = new Conference("Intel","London",105,72);
        Conference amdConference = new Conference("AMD", "New York", 75,
                45, "Monday", "Summing up", "Main street",
                "USA", 17.45, 5, 135);

        System.out.println(conference.toString());
        System.out.println(intelConference.toString());
        System.out.println(amdConference.toString());

        conference.resetValues("Apple", "Vakanda", 105,
                34, "Tuesday", "New inventions", "Coupertina street",
                "USA", 9.25, 3, 8); intelConference.printDuration();
        Conference.printStaticDuration();
    }
}
