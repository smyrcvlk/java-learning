package OCT_24_19;

public class arrays {
    public static void main(String[] args) {
        int[] xyz = {2, 11, 45, 9, 56};
        int max = xyz[0];
        int min = xyz[0];

        for(int i=1; i< xyz.length; i++)
        {
            if(xyz[i] > max)
                max = xyz[i];
            else if (xyz[i] < min)
                min= xyz[i];

        }

        System.out.println("Largest Number is : " + max);
        System.out.println("Smallest Number is : " + min);
    }


        //i starts with 0 as array index starts with 0 too

        //the task is to find and print out the maximum element
      //  for (int i = 0; i < xyz.length; i++) {
           // System.out.println(xyz[i]);



        }
