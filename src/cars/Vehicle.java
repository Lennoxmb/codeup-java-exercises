package cars;

public class Vehicle {

        private String name;

        public String getName() {
            return name;
        }

    public Vehicle(String name) {
    }
    public void setName(String name) {
            this.name = name;
        }

        public void makeNoise(){
            System.out.println(this.name + " goes vroom vroom");
        }
}
