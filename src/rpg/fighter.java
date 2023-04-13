package rpg;

public class fighter {
        //plain old java object aka POJO
        public static int totalFighters;

        private String name;
        private int hitPoints;
        private int maxDamage;
        public static int armorClass = 15;


        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int gethitPoints() {
                return hitPoints;
        }

        public void sethitPoints(int hitPoints) {
                this.hitPoints = hitPoints;
        }

        public int getMaxDamage() {
                return maxDamage;
        }

        public void setMaxDamage(int maxDamage) {
                this.maxDamage = maxDamage;
        }
        // code > generate > getter and setter
        public void printStats(){
            System.out.printf("%s has %d HP, and does %d max damage. Armor class is %d%n", name, hitPoints, maxDamage, armorClass);
        }

        public fighter() {
                totalFighters++;
        }
        public fighter(String name, int hitPoints, int maxDamage){
                totalFighters++;
                this.name = name;
                this.hitPoints = hitPoints;
                this.maxDamage = maxDamage;



        }

}