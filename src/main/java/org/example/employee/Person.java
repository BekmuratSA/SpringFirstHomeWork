package org.example.employee;

import org.example.model.Cow;
import org.example.model.Dog;
import org.example.model.Horse;

public class Person {

private String  personName;
private String age;
private String animal;
private Horse horse;
private Dog dog;
private Cow cow;

public void horse(){
   horse.animalPlus();
   horse.animalMinus();
}

public void dog(){
    dog.animalPlus();
    dog.animalMinus();
}

public  void cow(){
    cow.animalPlus();
    cow.animalMinus();
}
    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cow getCow() {
        return cow;
    }

    public void setCow(Cow cow) {
        this.cow = cow;
    }

    public Horse getHorse() {
        return horse;
    }

    public void setHorse(Horse horse) {
        this.horse = horse;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", age='" + age + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }
}