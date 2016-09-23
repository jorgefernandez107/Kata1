package kata1;

import java.util.Date;

public class Person {

    private final String name;
    private final String lastName;
    private final Date birthDate;

    public Person(String name, String lastName, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return (int) ((new Date().getTime() - birthDate.getTime()) / 31536000000L);
    }
}
