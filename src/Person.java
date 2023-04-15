public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name + " says hi.");
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}