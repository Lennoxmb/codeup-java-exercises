public class AbstractInterfaceLecture {
    public static void main(String[] args) {
        //cant make object from abstract class
//        Employee newGuy = new Employee("jason", "Delivery");
//        Developer newGuy = new Developer("jason", "Delivery");
//        System.out.println(newGuy.work());

        //this comes from the thing at bottom
        Bear bigBear = new Bear("Yogie", "Grizzly", 1200, true);
        System.out.println(bigBear.skin());
    }
}



abstract class Employee {
    protected String name;
    protected String department;



    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public abstract String work();

}

class Developer extends Employee {
    public Developer(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "writing code....";
    }
}
// abstract class holds different methods in it that are related in some way, zillow has different bed/bath numbers or rental/own/lot etc.
abstract class Notification {
    public abstract boolean didOptIn();
    public abstract String unsubscribeLink();
    public abstract String getPhysicalAddress();
    public abstract String getSenderInfo();

}

abstract class Animal {
    protected String name;
    protected String species;
    protected double weight;
    protected boolean isLegendary;

    public Animal(String name, String species, double weight, boolean isLegendary) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.isLegendary = isLegendary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }
}

    class Bear extends Animal implements Skinnable {
        public Bear(String name, String species, double weight, boolean isLegendary) {
            super(name, species, weight, isLegendary);
        }

        @Override
        public String skin() {
            if (this.isLegendary) {
                return "Legendary Bear Hide";
            } else {
                return "Bear Hide";
            }
        }
    }
//---------------------------------------------------------------------------------------- wishlist
    abstract class List {
        protected String name;
        protected double id;
    protected String [] items;

    public List(String name, double id, String[] items) {
        this.name = name;
        this.id = id;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public void addItem(String item) {

    }
}

class WishList extends List implements Shareable,Deletable {

    public WishList(String name, double id, String[] items) {
        super(name, id, items);
    }

    @Override
    public String shareLink() {
        //do all the backend things to make a sharelink
        return "https://mysharelink.com";
    }
    @Override
    public String delete() {
        return (this.name + "was deleted.");
    }
}

class PrivateList extends List {

    public PrivateList(String name, double id, String[] items) {
        super(name, id, items);
    }
}

