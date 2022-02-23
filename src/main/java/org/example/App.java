package org.example;

import org.example.employee.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson",Person.class);

        System.out.println(person);
        System.out.println(person.getHorse());
      person.horse();

        System.out.println("-------------------------------------------");

        Person person2 = context.getBean("myPerson2",Person.class);

        System.out.println(person2);
        System.out.println(person2.getDog());
        person2.dog();

        System.out.println("-------------------------------------------");

        Person person3 = context.getBean("myPerson3",Person.class);

        System.out.println(person3);
        System.out.println(person3.getCow());
        person3.cow();
    }
}
