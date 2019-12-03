package week6.object;

import java.util.Objects;

public class Person2 {
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    public Person2(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }


    @Override
    public String toString() {
        return "Person2{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';


    }
}
