package Collections;
import rpg.Monster;
import java.util.ArrayList;
import rpg.*;

public class CollectionsLecture {
    public static void main(String[] args) {
        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);

        ArrayList<Monster> monsterList = new ArrayList<>();
        //with arrays we have to assign values to variables
        //array syntax is : monsterArray[0] = blueDragon;
        monsterList.add(orc);
        monsterList.add(ogre);
        monsterList.add(blueDragon);

        for (Monster monster : monsterList){
            System.out.println(monster.getName());
        }
        //size of the list, not size of the monsters
        //instead of length property, lists have size method
        System.out.println(monsterList.size());
        //to access an array element i use bracket notations with the index of the element "monster[1]" but for lists I use .get() method and pass the method the index
        System.out.println(monsterList.get(1).getName());
    }

}
