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

}
