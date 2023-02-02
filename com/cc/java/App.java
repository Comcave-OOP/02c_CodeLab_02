package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mütze", "Max", "Produktion", 2000);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Peter", "Buchhaltung", 1995);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Jung", "Tobias", "Lager", 2022);

        pollMitarbeiter(mitarbeiter1);
        pollMitarbeiter(mitarbeiter2);
        pollMitarbeiter(mitarbeiter3);
    }

    private static void pollMitarbeiter(Mitarbeiter ma){
        output(ma.getInfo("#name"));
        output(ma.getInfo("#role"));
        output(ma.getInfo("#entry"));
        output("------------------");
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

