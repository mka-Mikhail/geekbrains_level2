package lesson_1.homeWork.num1;

public class Wall implements Obstacle {

    private final int height = 50;

    @Override
    public boolean doIt(Competitor competitor) {
        return competitor.jump(height);
    }
}
