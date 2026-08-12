import java.util.ArrayList;
public class CricketTeamSubstitution{
    public static void main(String[] args){
        ArrayList<String> players = new ArrayList<>();
        
        players.add("Virat");
        players.add("Rohit");
        players.add("Gill");
        players.add("Shami");
        
        String nameOfPlayer = "Gill";
        
        int indexofPlayer = players.indexOf(nameOfPlayer);
        
        if( indexofPlayer != -1){
            players.set(indexofPlayer , "Rahul");
            System.out.println("player is substituted");
        }
        else{
            System.out.println("player is not substituted");
        }
        
        for(String name : players){
            System.out.println(name);
        }
    }
}