package lesson_1.num1;

public class Human {

    private int numberOfRun;
    private int numberOfJump;

    public Human(int numberOfRun, int numberOfJump) {
        this.numberOfRun = numberOfRun;
        this.numberOfJump = numberOfJump;
    }

    public int getNumberOfRun() {
        return numberOfRun;
    }

    public int getNumberOfJump() {
        return numberOfJump;
    }

    public void run() {
        System.out.println("Человек бегает");
    }

    public void jump() {
        System.out.println("Человек прыгает");
    }
}
