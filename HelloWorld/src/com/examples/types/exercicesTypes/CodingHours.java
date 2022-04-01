package com.examples.types.exercicesTypes;

public class CodingHours {
    public static void main(String[] args) {
        float attTimePerDay = 6f; // An average Green Fox attendee codes 6 hours daily
        float semLenghtWeek = 17f;   // The semester is 17 weeks long
        float workDayPerWeek = 5f;   // the attendee only codes on workdays.
        float AvWorkHoursPerWeek = 52; // the average work hours weekly is 52

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        float sol1 = attTimePerDay * semLenghtWeek * workDayPerWeek;
        System.out.println("hours is spent with coding in a semester by an attendee: " + sol1);

        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float workPerWeek = attTimePerDay * workDayPerWeek;
        float sol2 = (workPerWeek / AvWorkHoursPerWeek) * 100;
        System.out.println("the percentage of the coding hours in the semester: " + sol2);
    }
}
