package NOV_21_19;



public class exception1 {
    public static void main(String[] args) {


    // create array of size 5
// try to access to index 10

    int []numbers= new int[5];
try {
    System.out.println(numbers[10]);
}catch (Exception e){
    System.out.println("this is too much");
}
}
}