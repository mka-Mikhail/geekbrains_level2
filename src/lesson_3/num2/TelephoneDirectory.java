package lesson_3.homeWork.num2;

public class TelephoneDirectory implements Comparable<TelephoneDirectory> {

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
    public int compareTo(TelephoneDirectory o) {
        return getLastname().compareTo(o.getLastname());
    }

    @Override
    public String toString() {
        return "{lastname=" + lastname + ", number=" + number + "}\n";
    }
}
