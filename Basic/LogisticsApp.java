interface Trackable{
    void updateLocation(String newLocation);
}

abstract class Parcel{
    private String trackingId;
    private double weight;
    
    public Parcel(String trackingId , double weight){
        this.trackingId = trackingId;
        this.weight =weight;
    }
    
    public String gettrackingId(){
        return this.trackingId;
    }
    public double getweight(){
        return this.weight;
    }
    
    public abstract double claculateShippingCost();
}

class StandardParcel extends Parcel implements Trackable{
    public StandardParcel (String trackingId , double weight){
        super(trackingId,weight);
    }
    
    @Override
    public double claculateShippingCost(){
        double result = getweight()*2.5;
        return result;
    }
    
    @Override
    public void updateLocation(String newLocation){
        System.out.println("Standard Shipment "+gettrackingId()+ " moved to "+newLocation);
    }
}

class ExpressParcel extends Parcel implements Trackable{
    boolean isOvernight;
    
    public ExpressParcel(String trackingId , double weight , boolean isOvernight){
        super(trackingId , weight);
        this.isOvernight = isOvernight;
    }
    
    @Override
    public double claculateShippingCost(){
        double result = getweight()*0.5;
        if (isOvernight == true){
            result += 10;
        }
        return result;
    }
    
    @Override
    public void updateLocation(String newLocation){
        System.out.println("EXPRESS shipment "+gettrackingId()+" rushed to "+newLocation);
    }
}

public class LogisticsApp{
    public static void main(String[] args){
        Parcel[] tracked = {
            new StandardParcel("gg121" , 34.76),
            new ExpressParcel("gg122" , 24.76, true)
        };
        
        for(Parcel par: tracked){
            par.claculateShippingCost();
            
            Trackable track = (Trackable)par;
            track.updateLocation("lucknow");
            
            System.out.println();
        }
        
        
    }
}