package Arrays;

public class CheckArraySorted {

public static  void main(String args[]){

    int arr[] = {1, 2, 3,5 ,5, 2};

    boolean sorted =true;

    for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]) {

                sorted = false;
                break;

            }

    }
    if(sorted){
        System.out.println("Array is Sorted");
    }else {
        System.out.println("Array is not Sorted");
    }

}
}
