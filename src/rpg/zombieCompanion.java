package rpg;

public class zombieCompanion {
    private String name;
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
        System.out.printf("%s, is a %s creature, has %d HP, and does %d max damage.%n", name, size, hitPoints, maxDamage);
    }
    public void sounds(){
        System.out.printf("When %s attacks, it makes a loud \"%s\" sound.%n", name, noise);
    }

    public zombieCompanion(){}
    public zombieCompanion(String name, String size, int hitPoints, int maxDamage, String noise) {
        this.name = name;
        this.size = size;
        this.hitPoints = hitPoints;
        this.maxDamage = maxDamage;
        this.noise = noise;

        }
    }
