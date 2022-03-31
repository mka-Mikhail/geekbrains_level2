package lesson_1.num1;

public class Wall {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean result(boolean jump) {
        if (jump) {
            System.out.println("Успешно прыгнул");
            return true;
        }

        else {
            System.out.println("Не смог прыгнуть");
            return false;
        }
    }
}
