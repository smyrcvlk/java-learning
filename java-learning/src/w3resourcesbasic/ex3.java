package w3resourcesbasic;

public class ex3 {
    public static void main(String[] args) {
        //  Write a Java program to find the duplicate values of an array of integer values.

 //       int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};

//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if ((arr[i] == arr[j]) && (i != j)) {
//                    System.out.println("Duplicate Element " +  arr[j]);
//                }
 //           }
//        }
        int [] arr={ 1,1, 2,2,3, 4, 5,};
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if((arr[i]==arr[j]) && (i!=j)){
                    System.out.println(" duplicate " + arr[j]);
                }

            }

        }

    }

}