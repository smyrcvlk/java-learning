package NOV_21_19;


    class Food {

        public String name;

        public Food() {
            System.out.println("Default constructor");
            name = "My Food";
        }

        public Food(String n) {
            System.out.println("Constructor with one parameter");
            name = n;
        }

        public String print() {
            return "Food name is:" + name;
        }

    }

