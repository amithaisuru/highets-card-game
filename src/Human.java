public class Human extends Player{
    private static int humanPlayerCount = 1;
    public Human(){
        this.name = "Player " + humanPlayerCount;
        this.id = playerCount;
        humanPlayerCount++;
        playerCount++;
    }

    public Human(String name){
        this.name = name;
        this.id = playerCount;
        playerCount++;
    }

}
