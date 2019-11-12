package NOV_09_19;

public class task11 {
    public static void main(String[] args) {
        // write a java program that print array in this manner
        // using while loop
        // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        //output:
        //  1 10
        //  2 9
        //  3 8
        //  4 7
        //  5 6
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        int i = intArray.length-1;
        int c =0;
        while (i>=0 && c>=0){
            System.out.println(intArray[c]+ " "+ intArray[i]);
            i--;
            c++;
        }
    }
}
