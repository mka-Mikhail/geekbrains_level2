package lesson_1.homeWork.num1;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {

        System.out.println("Выступает команда: " + team.getName());

        for (Competitor c :
                team.getTeam()) {
            int count = 0;
            for (Obstacle o :
                    obstacles) {
                if (o.doIt(c)) count++;
                else break;
            }
            if (count == obstacles.length) System.out.println("Участник " + c.toString() + " прошёл испытания");
        }
    }
}
