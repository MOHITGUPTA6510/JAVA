import java.util.ArrayList;

public class AirportSecuritySystem{
    public static void main(String[] args){
        ArrayList<String> passengerManifest = new ArrayList<>();
        
        passengerManifest.add("Karan");
        passengerManifest.add("Pooja");
        passengerManifest.add("Rohan");
        passengerManifest.add("Nisha");
        passengerManifest.add("Aman");
        
        String search = "Rohan";
        
        int position = passengerManifest.indexOf(search);
        
        if (position != -1){
            System.out.println("Rohan exist at "+position);
        }
        else{
            System.out.println("Rohan does not exist");
        }
        
        System.out.println(passengerManifest);
    }
}