package cars;

public class motorBike extends Vehicle {
    public motorBike(String name) {
        super(name);
    }

    public void makeNoise() {
        System.out.println(this.getName() + " goes Harley harley harley harley. Davidson");
//        super.makeNoise();
        System.out.println(this.getName() + " goes VROOOOOOOOOM");
    }
}
