package lesson_1.homeWork.num1;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Васька");
        Human human = new Human("Василий");
        Robot robot = new Robot();
        RunningTrack runningTrack = new RunningTrack();
        Wall wall = new Wall();

        Team team = new Team("DreamTeam", cat, human, robot);
        Course course = new Course(runningTrack, wall);

        course.doIt(team);
    }
}
