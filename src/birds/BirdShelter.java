package birds;

public class BirdShelter {
//this is polymorphism. usually you can only have an array with 1 type of thing, but because they all come from super class "bird" you can put them all in an array


    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Finch();
        birds[0].setName("Finch");
        birds[1] = new Goose();
        birds[1].setName("Goose");
        birds[2] = new Quaker();
        birds[2].setName("Quaker");

        for (Bird bird : birds){
            bird.makeNoise();
        }
    }
}