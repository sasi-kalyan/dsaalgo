package problems;

public class MoveZeroesToEnd {

    /*
        * PS: Move all zeroes to the end while maintaining the relative order of non-zero elements.
        * Time Complexity: O(n)
        * Space Complexity: O(1)    
     */
    public static int[] moveZeroesToEnd(int[] arr, int n){

        if(arr.length == 0) return arr;

        int j = 0;
        for(int i = 0; i < n; i++){

            if(arr[i] != arr[j] && arr[i] == 0){
                j = i;
            }

            if(arr[i] > 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 2, 3, 0, 4, 0, 5};

        arr = moveZeroesToEnd(arr, arr.length);

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
