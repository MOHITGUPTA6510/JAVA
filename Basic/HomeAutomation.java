abstract class SmartDevice{
    String deviceName;
    boolean isOn = false;
    
    public SmartDevice(String deviceName){
        this.deviceName = deviceName;
    }
    public void togglePower(){
        if (isOn == true){
            isOn = false;
            System.out.println(deviceName+" is off. ");
        }
        else{
            isOn = true;
            System.out.println(deviceName+" is on. ");
        }
    }
    
    public abstract void executePrimaryAction();
}
class SmartLight extends SmartDevice{
    int brightnessLevel;
    
    public SmartLight(String deviceName , int brightnessLevel){
        super(deviceName);
        this.brightnessLevel = brightnessLevel;
    }
    
    @Override
    public void executePrimaryAction(){
        if (isOn == true){
            System.out.println(deviceName+" brightness set to "+brightnessLevel +"%");
        }
        else{
            System.out.println(deviceName+" is off");
        }
    }
}

class SmartThermostat extends SmartDevice{
    int targetTemprature;
    
    public SmartThermostat(String deviceName , int targetTemprature){
        super(deviceName);
        this.targetTemprature = targetTemprature;
    }
    
    @Override
    public void executePrimaryAction(){
        if (isOn == true){
            System.out.println(deviceName+" is setting to "+targetTemprature+"C");
        }
        else{
            System.out.println(deviceName+" is off");
        }
    }
}

public class HomeAutomation{
    public static void main(String[] args){
        SmartDevice lightDevice = new SmartLight("Room light",80);
        lightDevice.togglePower();
        lightDevice.executePrimaryAction();
        
        SmartDevice thermoDevice = new SmartThermostat("Nest Thermostat",22);
        thermoDevice.togglePower();
        thermoDevice.executePrimaryAction();
        
    }
    
}