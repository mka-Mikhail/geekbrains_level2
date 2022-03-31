package lesson_1.homeWork.num1;

public class Human implements Competitor {

    private String name;
    private final int runDistance = 100;
    private final int jumpDistance = 60;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public boolean run(int runDistance) {
        return this.runDistance >= runDistance;
    }

    @Override
    public boolean jump(int jumpDistance) {
        return this.jumpDistance >= jumpDistance;
    }

    @Override
    public String toString() {
        return "Человек " + name;
    }
}
