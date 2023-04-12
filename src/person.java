import rpg.fighter;

public class person {
    public static void main(String[] args) {
        person person1 = new person("Mirin");
        person1.printName();
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public person(){}
    public person(String name) {
        this.name = name;
    }


        public void printName() {
            System.out.printf("Hello, %s.%n", name);
        }
}
