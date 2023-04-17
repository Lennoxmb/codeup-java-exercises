package birds;

//because of the extend, the quaker can do anything the bird can do, it "inherited" from bird. bird is the super class, quaker is the subclass
public class Quaker extends Bird {
    public void makeNoise(){
        System.out.println(this.getName() + " goes SCREEEEEEE");
    }

    public Quaker(){
        //THIS calls the super class constructor
        super("Quaker");
        System.out.println("New quaker created!");
    }
}