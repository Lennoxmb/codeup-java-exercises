package cars;

public class motorBike extends Vehicle {
    public void makeNoise() {
        System.out.println(this.getName() + " goes Harley harley harley harley. Davidson");
//        super.makeNoise();
        System.out.println(this.getName() + " goes VROOOOOOOOOM");
    }
}
