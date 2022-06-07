package com.abdikadir;

public class Employee {

    //Fields/Attributes/
    private String name;
    private int id;
    private String city;

    //constructors
    //Default constructor
    public Employee() {
        this.name = ""; // this. refers to initializing
        this.id = 0;
        this.city = "";
    }
    // All args/parameter constructors
    public Employee(String name, int id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }
    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    // Method customize
    public void display(){
        System.out.printf("Name: " + getName() + " ID: " + getId() + "city: " + getCity());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}

