package rpg;

import rpg.animals.quote;

public class rpg {
    public static void main(String[] args) {

        fighter fighter1 = new fighter("Mirin", 17, 14);
        fighter1.printStats();
        fighter fighter2 = new fighter("Ia", 25, 23);
        fighter2.printStats();
        fighter fighter3 = new fighter("Khu'ra", 95, 50);
        fighter3.printStats();
        fighter fighter4 = new fighter("Lyriel", 100, 100);
        fighter4.printStats();
        fighter fighter5 = new fighter("Alrae", 10, 200);
        fighter5.printStats();


        zombieCompanion zombie1 = new zombieCompanion("Goura", "large Undead", "Alrae", 25, 30, quote.randomQuote());
        zombie1.printStats();
        zombie1.sounds();


        zombieCompanion zombie2 = new zombieCompanion("Latte Atte", "small Undead", "Alrae", 25, 30, quote.randomQuote());
        zombie2.printStats();
        zombie2.sounds();


        int d20roll = D20.rolld20();
        System.out.println("You rolld a " + d20roll);

        System.out.println("total fighters = " + fighter.totalFighters);
        System.out.println("total companions = " + zombieCompanion.totalCompanions);

    }
}