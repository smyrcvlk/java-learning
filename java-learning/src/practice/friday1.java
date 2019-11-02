package practice;

public class friday1 {
    public static void main(String[] args) {

        // the average
        //{45,2, 11, 45, 9, 56};

        int number[]= new int[]{45,2, 11, 45,9, 56};
        int sum=0;
        for(int i=0; i<number.length; i++)
            sum = sum +number[i];
         double average= sum/number.length;
        System.out.println("average of number of array is : " + average);


    }
}
