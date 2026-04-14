package Arrays;

import java.util.Scanner;

public class Array_Max_Min {
    public static void main(String args[]){

        int arr[] ={1,3, 5,4,002,304,8};
        int max = arr[0];
        int min = arr[0];
        int sum =0;
        for(int i =0;i<arr.length-1;i++){

            // Max in Array
            if(arr[i]>max){
                max = arr[i];
            }

            // Min in Array
            if(arr[i]<min){
                min = arr[i];
            }


        }

        // Sum of Array Elements
        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("Max in Array "+max);
        System.out.println("Min in Array  "+min);
        System.out.println("Sum of Array Elements  "+sum);
    }

}

