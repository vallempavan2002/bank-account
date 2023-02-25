import java.util.ArrayList;
import java.util.List;

public class app{
    public static void main(String args[]) throws Exception{
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("INDIA"));
        teams.add(new Team("Australia"));
        teams.add(new Team("England"));
        teams.add(new Team("Pakistan"));
        teams.add(new Team("NeaZealand"));

        List<Match> matches = Scheduler.createSchedule(teams);
        System.out.println(matches);
        Simulator.playMatches(matches);
        Simulator.showPointsTable(teams,matches);
    }
}