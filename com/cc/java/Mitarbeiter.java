package com.cc.java;

public class Mitarbeiter {

    private String familyName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String op){

        switch (op) {
            case "#name":
                return "Name: " + familyName + " " + firstName;
            case "#role":
                return "Abteilung: " + role;
            case "#entry":
                return "Eintrittsjahr: " + String.valueOf(yearOfEntry);
            default:
                return "ERROR";
        }

    }
    
    
}
