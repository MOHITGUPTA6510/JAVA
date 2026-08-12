class RideSharingTrip{
    private String driverName;
    private double ratePerKm;
    private boolean isPremiumRide;
    private boolean tripCompleted = false;
    
    public RideSharingTrip(String driverName , double ratePerKm , boolean isPremiumRide){
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.isPremiumRide = isPremiumRide;
    }
    
    double calculateFare(double distanceInKn){
        if (this.isPremiumRide == true){
            double fare  = (distanceInKn * this.ratePerKm) + 5;
            return fare;
            
        }
        else{
            double fare = distanceInKn * this.ratePerKm;
            return fare;
        }
    }
    
    void endtrip(double distanceInKn){
        if (distanceInKn <= 0){
            System.out.println("Enter the valid distance !!");
        }
        else if (this.tripCompleted == true){
            System.out.println("Trip already ended");
        }
        else{
            this.tripCompleted = true;
            System.out.println("Driver name : "+this.driverName);
            System.out.println("Total fare : "+calculateFare(distanceInKn));
        }
    }
}

public class RideSharingApp{
    public static void main(String[] args){
        RideSharingTrip firstRide = new RideSharingTrip("Mohit", 15.00 , true);
        firstRide.endtrip(10.00);
    }
}