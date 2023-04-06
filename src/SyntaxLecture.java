public class SyntaxLecture {

    public static void main(String[] args) {
        /* declaring vars without initializing*/
        int weight;
        //initialization after declaration
        weight = 12;
        // initialize and declare all at once
//        String breed = "Toy Spaniel";
//        String name = "Grinch";
//        int cuteness = 10;
//        //a statement:
//        //JVM, do something!
//        System.out.println(name + " is a " + breed);
//        System.out.println(cuteness + name);
        //very small number: byte datatype
        byte smol = 12;
        System.out.println(smol);
        //declare a long: can hold very big numbers
        long bigNumber;
        //assign the small value to the large var, "pour a small bucket into the large bucket"
        bigNumber = smol;
        System.out.println(bigNumber);
        bigNumber = 9000000000L;
        //wont let it go into smol, have to "cast" (byte)
//        smol = bigNumber;
        //casting: converting one data type to another
        smol = (byte) bigNumber;

        //float: 4 bytes of storage space
        float imafloat;
        //double has 8 bytes of storage space
        double imadouble = 9.0123456789012;
        //cant fit double in a float
//        imafloat = imadouble;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);
    }


}








