package statsAppV1;

public class PlayerClass {

    private int points, assists, twoPoints, threePoints, blocks, steals = 0;
    private String playerName, playerTeam;

    public PlayerClass(String playerName, String playerTeam) {
        this.playerName = playerName;
        this.playerTeam = playerTeam;
    }

    //methods to get stats
    public int getPoints(){
        return points;
    }

    public int getAssists(){
        return assists;
    }

    public int getTwoPoints(){
        return twoPoints;
    }

    public int getThreePoints(){
        return threePoints;
    }

    public int getBlocks(){
        return blocks;
    }

    public int getSteals(){
        return steals;
    }

    //methods to get player name and team
    public String getPlayerName(){
        return playerName;
    }

    public String getPlayerTeam(){
        return playerTeam;
    }

    //methods to increase player stats

    public void addAssists(){
        assists++;
    }

    public void addTwoPoints(){
        twoPoints++;
        points += 2;
    }

    public void addThreePoints(){
        threePoints++;
        points += 3;
    }

    public void addBlocks(){
        blocks++;
    }

    public void addSteals(){
        steals++;
    }
}
