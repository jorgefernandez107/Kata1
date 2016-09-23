package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Jorge","Fernández", new Date(80,10,29));
        System.out.println(person.getName() + " " + person.getLastName() + " tiene " + person.getAge() + " años.");
    }
}