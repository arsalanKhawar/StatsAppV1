package statsAppV1;

import java.util.ArrayList;

public class TeamClass {

    private int teamPoints = 0;
    private String teamName;
    private ArrayList<String> players = new ArrayList<>();

    public TeamClass(String teamName){
        this.teamName = teamName;
    }

    //method to get team points
    public int getTeamPoints(){
        return teamPoints;
    }

    //method to get team name
    public String getTeamName(){
        return teamName;
    }

    //method to get list of players
    public ArrayList getPlayers(){
        return players;
    }

}
