package rpg;

public class zombieCompanion {
    public static int totalCompanions;

    private String name;
    private String owner;
    private String size;
    private int hitPoints;
    private int maxDamage;
    private String noise;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public void printStats(){
        System.out.printf("%s is a %s creature that belongs to %s, has %d HP, and does %d max damage.%n", name, size, owner, hitPoints, maxDamage);
    }
    public void sounds(){
        System.out.printf("When %s attacks, it makes a loud \"%s\" sound.%n", name, noise);
    }

    public zombieCompanion(){
        totalCompanions++;
    }
    public zombieCompanion(String name, String size, String owner, int hitPoints, int maxDamage, String noise) {
        totalCompanions++;
        this.name = name;
        this.size = size;
        this.owner = owner;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.noise = noise;

        }
    }
