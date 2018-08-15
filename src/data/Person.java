package data;

public class Person {

    private String firstName;
    private String lastName;
    private double score;


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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "imię: " + firstName + ", nazwisko: " + lastName + ", wynik: " + score + "\n";
    }
}
