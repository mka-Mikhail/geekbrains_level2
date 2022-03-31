package lesson_1.num1;

public class Cat {

    private int numberOfRun;
    private int numberOfJump;

    public Cat(int numberOfRun, int numberOfJump) {
        this.numberOfRun = numberOfRun;
        this.numberOfJump = numberOfJump;
    }

    public int getNumberOfRun() {
        return numberOfRun;
    }

    public int getNumberOfJump() {
        return numberOfJump;
    }

    public static void run() {
        System.out.println("Кот бегает");
    }

    public void jump() {
        System.out.println("Кот прыгает");
    }
}
