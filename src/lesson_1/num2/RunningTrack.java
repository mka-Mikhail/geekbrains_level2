package lesson_1.homeWork.num1;

public class RunningTrack implements Obstacle {

    private final int distance = 50;

    @Override
    public boolean doIt(Competitor competitor) {
        return competitor.run(distance);
    }
}
