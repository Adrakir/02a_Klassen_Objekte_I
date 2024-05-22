package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        // Cat --> Referenztyp (Klasse aus dem das Objekt ensteht)
        // cat1 --> Refenzvariable (Adresse des Objekts im RAM)
        Cat cat1 = new Cat(); // Instanziierung >> Objekt
        System.out.println(cat1); // Adresse des Objekts

        Cat cat2 = new Cat();
        System.out.println(cat2);

 

    }

   

}

