package assessmentPractice;

//6. Create a PetDog class that inherits from Pet.
//10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.

import java.util.ArrayList;

public class PetDog extends Pet implements Companion {
    private boolean trained;
    public PetDog(String name, String type, boolean trained) {
        super(name, type);
        this.trained = trained;
    }
    public boolean isTrained() {
        return trained;
    }
    public String snuggle() {
        return this.getName() + " wants to snuggle";
    }
    //12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.
    public static void allSnuggle(ArrayList<PetDog> petDogs) {
        for (PetDog petDog : petDogs) {
            System.out.println(petDog.snuggle());
        }
    }
}
