import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {
    String[] adjectives = {"slimy", "gross", "tall", "harry", "dirty", "green", "bug-eyed", "smelly", "unkept", "stupid"};
    String[] nouns = {"store", "mall", "codey", "remsie", "computer", "chair", "desk", "teacher", "student", "another-thing"};

    String[][] words = {adjectives, nouns};


   public String randomWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        String randomWord = Arrays.toString(words[index]);
        System.out.println(randomWord);
        return randomWord;
    }


    public void main(String[] args) {




    }
}


//    Server Name Generator
//
//        We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
//
//        Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//        Create a method that will return a random element from an array of strings.
//        Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
//        Example Output
//
//
//        Here is your server name:
//        dedicated-photon