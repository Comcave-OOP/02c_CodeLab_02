package com.cc.java;

public class App {
    
    public static void main(String[] args) {
        
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mütze", "Max", "Produktion", 2000);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Schmidt", "Peter", "Buchhaltung", 1995);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Jung", "Tobias", "Lager", 2022);

        output(mitarbeiter1.getInfo("#name"));
        output(mitarbeiter1.getInfo("#role"));
        output(mitarbeiter1.getInfo("#entry"));
        output("------------------");
        output(mitarbeiter2.getInfo("#name"));
        output(mitarbeiter2.getInfo("#role"));
        output(mitarbeiter2.getInfo("#entry"));
        output("------------------");
        output(mitarbeiter3.getInfo("#name"));
        output(mitarbeiter3.getInfo("#role"));
        output(mitarbeiter3.getInfo("#entry"));
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

