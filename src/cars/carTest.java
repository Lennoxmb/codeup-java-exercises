package cars;



import java.util.ArrayList;

public class carTest {
    public static void main(String[] args) {
//            motorBike motorBike = new motorBike ();
//            motorBike.setName("Harley");
////            motorBike.makeNoise();
//
//        Garage garage = new Garage();
//        garage.vehicles = new Vehicle[2];
//        garage.vehicles[0] = new motorBike();
//        garage.vehicles[0].setName("harley");
//        garage.vehicles[1] = new motorBike();
//        garage.vehicles[1].setName("Goose");
//        garage.alarmCascade();

        Vehicle sedan = new Vehicle("");
        sedan.setName("Angel");
        Vehicle hearse = new Vehicle("");
        hearse.setName("Morticia");
        Vehicle truck = new Vehicle("");
        truck.setName("Beast");

        ArrayList<Vehicle> myCars = new ArrayList<>();

        myCars.add(sedan);
        myCars.add(hearse);
        myCars.add(truck);

        for (Vehicle cars : myCars){
            System.out.println(cars.getName());
        }

        System.out.println(myCars.size());

    }
}
