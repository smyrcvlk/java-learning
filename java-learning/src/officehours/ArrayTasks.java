package officehours;

import java.util.Arrays;

public class ArrayTasks {
    public static void main(String[] args) {

                String[] arr= {"zero", "one","two","three","four"};
                //array icerisinde kac tane kelime e harfini icerir
                //count how many words have 'e' in the arr

                int counter=0;
                for(String str:arr) {  //for(int i = 0; i < arr.length; i++ )
                    if(str.contains("e")) {
                        counter++; //counter = counter + 1;   counter--;
                    }
                }

                System.out.println(counter);
                //create array fewValues, with size of counter
                String [] fewValues=new String[counter];

                //go over arr one more time and add the words with 'e' into few Values

                int i=0;
                for (String each:arr) {
                    if(each.contains("e")) {
                        fewValues[i]=each;
                        i++;
                        System.out.println(each);

                    }
                }

                String [] fewValues2=new String[counter];
                int k = 0;
                for(int j = 0; j < arr.length; j++) {
                    if(arr[j].contains("e")) {
                        fewValues2[k] = arr[j];
                        k++;
                    }

                }

                System.out.println("fewValues = " + Arrays.toString(fewValues));

                System.out.println("fewValues2 = " + Arrays.toString(fewValues2));


    }
}
