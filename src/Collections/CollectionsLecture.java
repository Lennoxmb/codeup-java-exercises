package Collections;

import rpg.*;

import java.util.*;

import static java.util.Map.entry;

public class CollectionsLecture {

    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
        Monster frostGiant = new Monster("Frost Giant", 15, 138, 25);
        Monster goblin = new Monster("Goblin", 15, 7, 5);
        Monster werewolf = new Monster("Werewolf", 11, 58, 7);

//        ArrayList<Monster> monsterList = new ArrayList<>();
        // With arrays we have to assign values to variables
        // Array syntax is : monsterArray[0] = blueDragon;

        // With Lists, we can use the .add method to add
        // elements one at a time
//        monsterList.add(orc);
//        monsterList.add(ogre);
//        monsterList.add(blueDragon);

        // We could also create an arrayList, initialize it, and
        // add items to it all at once, using the List.of method

//        ArrayList<Monster> monsterList = new ArrayList<>(List.of(orc, ogre, blueDragon));

        // Creating a list based on an array

        // If I already have an array, like this:

        Monster[] monsters = {orc, ogre, blueDragon};

        // I could add it to a list, like this:

        ArrayList<Monster> monsterList = new ArrayList<>(Arrays.asList(monsters));

        // looping over an array list: same syntax as
        // for an array
//        for (Monster monster : monsterList) {
//            System.out.println(monster.getName());
//        }

        // Instead of a length property, Lists have
        // a size method
//        System.out.println(monsterList.size());


        // To access an array element, I use bracket notation
        // with the index of the element: Monster[1]
        // But for lists, I use the .get() method and
        // pass the method the index
//        System.out.println(monsterList.get(1).getName());


        // Sorting arrayLists
        ArrayList<String> sonnetWords = WordLists.generateSonnetWordList();


        Collections.shuffle(sonnetWords);

//        for (String word : sonnetWords){
//            System.out.println(word);
//        }

//        Collections.sort(sonnetWords);
//        for (String word : sonnetWords){
//            System.out.println(word);
//        }

        // Sorting objects by a string property alphabetically

        ArrayList<Poet> poetsList = Poets.generatePoetList();


        poetsList.sort(Comparator.comparing(Poet::getName));

//        for (Poet poet : poetsList){
//            System.out.printf("%s was born in %d, died in %d, and is a %s poet.%n", poet.getName(), poet.getBirthDate(), poet.getDeathDate(), poet.getStyle());
//        }

        // Generate a list of coding languages

        ArrayList<CodingLanguage> languages = CodingLanguages.generateLanguageList();

        // Sort by language alphabetically

//        languages.sort(Comparator.comparing(CodingLanguage::getName));

        // Sort numerically by creation date

        languages.sort(Comparator.comparing(CodingLanguage::getCreatedDate));

//        for (CodingLanguage language : languages){
//            System.out.printf("%s was created by %s in %d.%n", language.getName(), language.getCreator(), language.getCreatedDate());
//        }

        // Hash Maps

        HashMap<String, Integer> careerWins = new HashMap<>();

        // To add elements to a HashMap, use the .put() method

        careerWins.put("Gregg Popovich", 1366);
        careerWins.put("Don Nelson", 1335);
        careerWins.put("Lenny Wilkens", 1332);

        // To retrieve an item from a HashMap, use .get() and pass it the key

//        System.out.println(careerWins.get("Gregg Popovich"));

        // To replace a value, use .replace()

        careerWins.replace("Gregg Popovich", 1367);

//        System.out.println(careerWins.get("Gregg Popovich"));

//        HashMap<String, Monster> monsterMap = new HashMap<>();

        // To add multiple entries at once, we can use Map.ofEntries()

        Map<String, Monster>   monsterMap = Map.ofEntries(
                entry("Orc", orc)
        );
    }
}