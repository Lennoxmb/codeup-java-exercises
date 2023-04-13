public class person {
    public static void main(String[] args) {
        person person1 = new person("Mirin");
        person person2 = person1;
        System.out.println(person1 == person2);
        person person3 = new person("Alrae");
        person3.printName();
    }
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public person(String name) {
        this.name = name;
    }


        public void printName() {
            System.out.printf("Hello, %s.%n", name);
        }
}
