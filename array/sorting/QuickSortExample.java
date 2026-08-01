package sorting;

public class QuickSortExample {

    static int[] arr = {1, 5, 6, 9, 12, 3, 10};

    public static int partition(int[] arr, int low, int high){

        int pivot = arr[high];
        int j = low - 1;

        for(int i = low; i < high; i++){

            if(arr[i] < pivot){

                j++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[ j + 1];
        arr[j + 1] = arr[high];
        arr[high] = temp;

        return j + 1;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){

            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
        }
    }

    public static void main(String[] args) {
        quickSort(arr, 0, arr.length - 1);

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
