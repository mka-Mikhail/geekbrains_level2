package lesson_1.homeWork.num1;

public class Team {

    private String name = "DreamTeam";
    private Competitor[] team;

    public Team(String name, Competitor... team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public Competitor[] getTeam() {
        return team;
    }
}
