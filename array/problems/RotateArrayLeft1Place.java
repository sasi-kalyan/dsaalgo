package problems;

public class RotateArrayLeft1Place {

    public static int[] rotateArrayLeft1Place(int[] arr, int n){

        if(arr.length == 0) return arr;

        int first = arr[0];

        for(int i = 1; i < n; i++){

            arr[i - 1] = arr[i];
        }
        arr[n - 1] = first;

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        arr = rotateArrayLeft1Place(arr, arr.length);

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
