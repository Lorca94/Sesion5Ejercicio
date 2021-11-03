package com.sesion5;

import javax.sound.midi.Soundbank;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {


        CocheCRUDImpl Ford = new CocheCRUDImpl("Coche1","Ford","Focus");
        CocheCRUDImpl Toyota = new CocheCRUDImpl("Coche2","Toyota","Celica");

        cocheCRUD.findAll();
        cocheCRUD.save(new CocheCRUDImpl());
        cocheCRUD.delete(new CocheCRUDImpl());

        System.out.println(Ford);
        System.out.println(Toyota);



    }

}
