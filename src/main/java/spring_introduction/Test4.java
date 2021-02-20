package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
        Dog myDog = context.getBean("myPet", Dog.class);
//       myDog.setName("Belka");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        //yourDog.setName("Strelka");
        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.getSurname());
       // System.out.println(myDog.getName());
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
        //myDog.say();
        //System.out.println(myDog.getName());
        myDog.say();
//
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
//        System.out.println(myDog == yourDog);
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }
}
