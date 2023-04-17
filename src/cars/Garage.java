package cars;

public class Garage {
//protected and default mean the same thing, it's only access in the package
    //final can't be inherited or over written, it's like const
    protected Vehicle[] vehicles;

    public void alarmCascade() {
        for (Vehicle vehicle : vehicles){
            vehicle.makeNoise();
        }
    }
    public static void main(String[] args) {

//        Vehicle[] vehicles = new Vehicle[2];
//        vehicles[0] = new motorBike();
//        vehicles[0].setName("harley");
//        vehicles[1] = new motorBike();
//        vehicles[1].setName("Goose");



    }
}
