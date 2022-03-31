package lesson_1.num1;

public class RunningTrack {

    private int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public boolean result(boolean run) {
        if (run) {
            System.out.println("Успешно пробежал");
            return true;
        }
        else {
            System.out.println("Не смог пробежать");
            return false;
        }
    }
}
