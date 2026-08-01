package searching;

public class LinearSearchExample{

    /*
            algorithm: linear search
            description: it searches entire array until the target element founds, if not exists return -1
     */
    public static int linearSearch(int[] arr, int n, int target){

        if(arr.length == 0)
            return -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1, 5, 6, 9, 7, 2, 0};
        int target = 7;

        int index = linearSearch(arr, arr.length, target);

        System.out.println("Element found at index: " + index);
    }
}