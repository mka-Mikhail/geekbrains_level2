package lesson_1.homeWork.num1;

public class Robot implements Competitor {

    private String name = "T1000";
    private final int runDistance = 100;
    private final int jumpDistance = 60;

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
        return "Робот " + name;
    }
}
