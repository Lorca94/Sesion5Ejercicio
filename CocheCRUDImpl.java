package com.sesion5;

public class CocheCRUDImpl implements CocheCRUD {

    String name;
    String model;
    String manufactured;


    public CocheCRUDImpl(){

    }

    public CocheCRUDImpl(String name, String model, String manufactured){
        this.name = name;
        this.model = model;
        this.manufactured = manufactured;


    }


    @Override
    public void save(CocheCRUDImpl cochecrudImpl) {
        System.out.println("save");

    }

    @Override
    public void findAll() {
        System.out.println("findAll");

    }

    @Override
    public void delete(CocheCRUDImpl cochecrudImpl) {
        System.out.println("delete");

    }


    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufactured='" + manufactured + '\'' +
                '}';
    }
}
