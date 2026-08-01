package searching;

public class BinarySearchExample {

    public static int binarySearch(int[] arr, int n, int target){

        if(arr.length == 0){
            return -1;
        }

        int low = 0, high = arr.length-1;

        while(low <= high){

            int mid = low + ((high - low)/2);

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 10, 12, 15, 17, 19};
        int target = 7;

        int index = binarySearch(arr, arr.length, target);
        System.out.println("Element found at index : "+ index);
    }
}
