package org.example.model;


public class Horse implements Animal{

    private String name;
    private String breed;
    private int age;

    public Horse(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void animalPlus() {
        System.out.println("Oor ishterge ishtetilet, minilet, eti jese bolot");
    }

    @Override
    public void animalMinus() {
        System.out.println("Ayabay ele kop chop jeyt");
    }
}
