package sorting;

public class InsertionSortExample {


    public static int[] insertionSort(int[] arr, int n){

        if(arr.length == 0) return arr;

        for(int i = 1; i < n; i++){

            int j = i - 1;
            int key = arr[i];

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};

        arr = insertionSort(arr, arr.length - 1);

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
