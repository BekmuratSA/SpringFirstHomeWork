package org.example.model;

public class Cow implements Animal{

    private String name;
    private String breed;
    private int age;

    public Cow(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public void animalPlus() {
        System.out.println("Et, sut praduksiya uchun bagilat");
    }

    @Override
    public void animalMinus() {
        System.out.println("Oz aldincha jashay albayt, bagu, karoo kerek");
    }
}
