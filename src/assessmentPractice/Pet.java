package assessmentPractice;

    //4. Create a class called Pet with two String instance variables, name and type.
    public class Pet {
        private String name;
        private String type;


        //5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
        public Pet(String name, String type) {
            this.name = name;
            this.type = type;
        }
        public String getName() {
            return name;
        }
        public String getType() {
            return type;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setType(String type) {
            this.type = type;
    }
}
