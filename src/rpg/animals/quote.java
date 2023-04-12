package rpg.animals;

public class quote {
    public static String randomQuote(){
        int randomNumber = (int) (Math.random()*4) +1;
        switch(randomNumber){
            case 1: return "Graaaaaahhhhhh";
            case 2: return "Uuuuuuuggghhhhra";
            case 3: return "Neeeahh";
            case 4: return "-pffft-";
        }
        return "";
    }
}
