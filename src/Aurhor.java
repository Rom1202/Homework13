import java.util.Objects;

public class Aurhor {
    private String firstName;
    private String lastName;

    public Aurhor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return "Author" +
                "firsName='" + firstName + '\'' +
                ",lastName=' " + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aurhor aurhor = (Aurhor) o;
        return Objects.equals(firstName, aurhor.firstName) && Objects.equals(lastName, aurhor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
