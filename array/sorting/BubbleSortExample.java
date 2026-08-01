package sorting;

public class BubbleSortExample {

    public static int[] bubbleSort(int[] arr, int n){
        if(arr.length == 0) return arr;

        for(int i = 0; i < n - 1; i++){

            for(int j = 0; j < (n - 1 - i); j++){

                if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 3, 9, 2, 6, 8};

        arr = bubbleSort(arr, arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }
}
