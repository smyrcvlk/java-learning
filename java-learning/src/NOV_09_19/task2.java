package NOV_09_19;

public class task2 {
    public static void main(String[] args) {
        // 2. Write a Java program to sum values of an array.

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            
        }
        System.out.println("The sum is " + sum);

        //2.way
        int sum2=0;
        for (int i = 0; i < numbers.length; i++) {
            int number= numbers[i];
            sum2+=number;

        }
        System.out.println(sum2);

        //3.way.  forr -> using for(int i = array.length-1), from reverse
        int sum3 = 0;
        for (int i = numbers.length - 1; i >= 0; i--){
            int number = numbers[i];
            sum3 += number;
        }
        System.out.println(sum3);

        if(sum == sum2 && sum == sum3){
            System.out.println("they are equal");
        }

    }
}