package assessmentPractice;

import java.util.ArrayList;

//11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
        public class PetDogTest {
            public static void main(String[] args) {
//                PetDog petDog = new PetDog("Fido", "dog", true);
//                System.out.println(petDog.snuggle());

            //12b.Create an ArrayList with at least three PetDog instances in the PetDogTest class.
                ArrayList<PetDog> petDogs = new ArrayList<>();
                petDogs.add(new PetDog("Fido", "dog", true));
                petDogs.add(new PetDog("Spot", "dog", true));
                petDogs.add(new PetDog("Rover", "dog", true));
                PetDog.allSnuggle(petDogs);
            }

        }