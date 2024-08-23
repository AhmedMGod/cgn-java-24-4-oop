package org.example;

public class Main {

    public static void main(String[] args) {

        Person pommes = new Person("Müller", 35, "1234567890", true);
        Person rotWeiß = new Person("Bauer", 23, "1234567890", true);


        Person[] phonebook = {pommes, rotWeiß};

        addPerson(pommes);
        addPerson(rotWeiß);

    }

    public static void addPerson(Person currywurst) {
        System.out.println(currywurst.name);

    }
}