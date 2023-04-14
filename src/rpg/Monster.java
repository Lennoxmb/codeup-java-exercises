package rpg;

public class Monster {
    //these are called "instance vars"
    private String name;
    private int armorClass;
    private int hitPoints;
    private int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    //this is a constructor, it constructs the instance vars for the actual monster
    public Monster(){}
    public Monster(String name, int armorClass, int hitPoints, int damage) {
        this.name = name;
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public void printStats() {
        System.out.printf(" The %s has an AC of %d, has %d HP, and does %d damage on average.%n", name, armorClass, hitPoints, damage);
    }






}
