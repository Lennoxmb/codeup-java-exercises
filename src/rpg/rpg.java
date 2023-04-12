package rpg;

import rpg.animals.quote;

public class rpg {
    public static void main(String[] args) {

        fighter fighter1 = new fighter("Iatharna", 17, 14);
        fighter1.printStats();
        fighter fighter2 = new fighter("Mirin", 25, 23);
        fighter2.printStats();
        fighter fighter3 = new fighter("Kura", 95, 50);
        fighter3.printStats();


        zombieCompanion zombie1 = new zombieCompanion("Goura", "large Undead", 25, 30, "GRRRRAAAAAAAAHHHHHHH");
        zombie1.printStats();
        zombie1.sounds();

        int d20roll = D20.rolld20();
        System.out.println(d20roll);


        zombieCompanion zombie2 = new zombieCompanion("Latte Atte", "large Undead", 25, 30, quote.randomQuote());
        zombie2.sounds();

        System.out.println(fighter.totalFighters);

    }
}