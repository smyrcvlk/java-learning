package NOV_21_19;

public class Task2 {
    //create a class
// add at least 3 attributes
// add at least 3 constructor
// add method that return all attributes as one string
// in Task 2 class create at least 4 object on that class
// call method to get attributes and print it

    class bank {

        public  String name;
        public  int getModelYear;

        int modelYear;
        int number;
        String modelName;

        public bank(int year, int num, String name){
            modelYear=year;
            int number= num;
            modelName=name;
        }

        public void main(String[] args) {
          bank bank=new bank(1980,1000, "chase ");
            System.out.println(bank.modelName +  bank.number +  bank.modelYear);
        }

    }

    }
