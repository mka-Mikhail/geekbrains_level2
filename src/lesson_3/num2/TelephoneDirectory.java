package lesson_3.num2;

public class TelephoneDirectory {

    private String lastname;
    private String number;

    public TelephoneDirectory(String lastName, String number) {
        this.lastname = lastName;
        this.number = number;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "{lastname=" + lastname + ", number=" + number + "}\n";
    }
}
