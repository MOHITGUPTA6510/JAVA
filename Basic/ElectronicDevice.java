class ElectronicDevices{
    String brand;
    
    public ElectronicDevices(String brand){
        this.brand = brand;
    }
    
    public void turnOn(){
        System.out.println("the "+brand+ "device is powering on");
    }
}

class SmartTv extends ElectronicDevices{
    int screenSize ;
    
    public SmartTv(String brand , int screenSize){
        super(brand);
        this.screenSize = screenSize;
    }
    
    public void turnOn(){
        System.out.println("the "+screenSize+"-inch "+brand+" TV glows to life" );
    }
}

class SmartPhone extends ElectronicDevices{
    int batteryLevel;
    
    public SmartPhone(String brand , int batteryLevel){
        super(brand);
        this.batteryLevel = batteryLevel;
    }
    
    public void turnOn(){
        System.out.println(brand+" smartphone's battery is :"+batteryLevel);
    }
}

public class ElectronicDevice{
    public static void main(String[] args){
        SmartTv newTv = new SmartTv("LG" , 56);
        newTv.turnOn();
        
        SmartPhone newPhone = new SmartPhone("Moto" , 76);
        newPhone.turnOn();
    }
}