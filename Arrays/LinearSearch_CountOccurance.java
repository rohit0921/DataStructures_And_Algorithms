package Arrays;

public class LinearSearch_CountOccurance {

public static  void main(String args[]){
    int target = 5;
    int arr[] = {234, 5, 23,-4 ,5, 234,23};
    int count =0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count++;
            System.out.println("Number "+target+" found at index");

        }
    }
    System.out.print("Count of Number: "+count);
}
}
