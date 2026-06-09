class Sensor {
    String name;
    int batteryLevel;

    Sensor(String name, int batteryLevel){
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    void charge(){
        batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
}

public class Main4 {
    public static void main(String[] args) {
        Sensor mySensor = new Sensor("TempSensor_01", 45);
        mySensor.charge(); 
        System.out.println("Current battery level: " + mySensor.batteryLevel + "%");
    }
}
