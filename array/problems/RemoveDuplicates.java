package problems;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] arr, int n){

        if(arr.length == 0) return arr;

        int[] temp = new int[n];

        int j = 0;
        for(int i = 0; i < n - 1; i++){

            if(arr[i] != arr[i + 1]){
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[n - 1];

        int[] farr = new int[j  + 1];
        for(int i = 0; i < farr.length; i++){
            farr[i] = temp[i];
        }

        return farr;
    }

    public static int removeDuplicates2(int[] arr, int n) {

        if(arr.length == 0) return 0;

        int j = 0;
        for(int i = 1; i < n; i++){

            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 4, 5};

        arr = removeDuplicates(arr, arr.length);

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        int len = removeDuplicates2(arr, arr.length);

        for(int i = 0; i < len; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
