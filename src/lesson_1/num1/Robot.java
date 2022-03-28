package lesson_1.num1;

public class Robot {

    private int numberOfRun;
    private int numberOfJump;

    public Robot(int numberOfRun, int numberOfJump) {
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
        System.out.println("Робот бегает");
    }

    public void jump() {
        System.out.println("Робот прыгает");
    }
}
