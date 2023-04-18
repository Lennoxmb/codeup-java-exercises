package rpg;

import rpg.animals.quote;

import java.util.ArrayList;
import java.util.Arrays;

public class rpg {
    // adds monster to the array and then makes new array... we dont do this but it happens behind scenes and good to konw how to do it and what it's doing
    public static Monster[] addMonster(Monster[] monstersArray, Monster newMonster){
        Monster[] newMonsterArray = Arrays.copyOf(monstersArray, monstersArray.length +1);
        newMonsterArray[newMonsterArray.length -1] = newMonster;
        return newMonsterArray;
    }


    public static void main(String[] args) {



        fighter fighter1 = new fighter("Mirin", 17, 14);
//        fighter1.printStats();
        fighter fighter2 = new fighter("Ia", 25, 23);
//        fighter2.printStats();
        fighter fighter3 = new fighter("Khu'ra", 95, 50);
//        fighter3.printStats();
        fighter fighter4 = new fighter("Lyriel", 100, 100);
//        fighter4.printStats();
        fighter fighter5 = new fighter("Alrae", 10, 200);
//        fighter5.printStats();


        zombieCompanion zombie1 = new zombieCompanion("Goura", "large Undead", "Alrae", 25, 30, quote.randomQuote());
//        zombie1.printStats();
//        zombie1.sounds();


        zombieCompanion zombie2 = new zombieCompanion("Latte Atte", "small Undead", "Alrae", 25, 30, quote.randomQuote());
//        zombie2.printStats();
//        zombie2.sounds();


        int d20roll = D20.rolld20();
//        System.out.println("You rolld a " + d20roll);

//        System.out.println("total fighters = " + fighter.totalFighters);
//        System.out.println("total companions = " + zombieCompanion.totalCompanions);

        Monster orc = new Monster("Orc", 13, 15, 9);
        Monster ogre = new Monster("Ogre", 11, 59, 13);
        Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
//        orc.printStats();

//        monster[] monsters = new monster[3];
//        monsters[0] = orc;
//        monsters[1] = ogre;
//        monsters[2] = blueDragon;
        Monster[] monsters = {orc, ogre, blueDragon};

        //every type of object type is a data type, so the label on the array "Monster[]" is the first Monster in the for loop
        //last one is the name of the array "monsters"



        Monster cloaker = new Monster("Cloaker", 14, 78, 10);
        Monster[] newMonsterArray = rpg.addMonster(monsters, cloaker);
        for (Monster monster : newMonsterArray){
            System.out.println(monster.getName());
        }

//        for (Monster dndMob : monsters){
//            System.out.printf("%s has %d HP%n", dndMob.getName(), dndMob.getHitPoints());
//        }
        //COLLECTIONS
        ArrayList<Monster> monsterList = new ArrayList<>();











    }
}