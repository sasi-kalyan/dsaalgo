package problems.easy;

public class RotateArrayLeftAndRightKPlaces {

    public static int[] rotateArrayLeftKPlaces(int[] arr, int k){

        int[] result = new int[arr.length];

        int p = k;
        int q = 0;
        int r = 0;

        for(int i = p; i < arr.length; i++){
            result[q] = arr[i];
            q++;
        }

        while(r < k){
            result[q] = arr[r];
            r++;
            q++;
        }

        return result;
    }

    public static int[] rotateArrayRightKPlaces(int[] arr, int k){

        int[] result = new int[arr.length];

        int n = arr.length;
        int p = n - k;
        int q = 0;
        int r = 0;

        for(int i = p; i < arr.length; i++){
            result[q] = arr[i];
            q++;
        }

        while(r < p){
            result[q] = arr[r];
            r++;
            q++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] result1 = rotateArrayLeftKPlaces(arr, k);

        for(int i : result1){
            System.out.print(i + " ");
        }
        System.out.println();

        int[] result2 = rotateArrayRightKPlaces(arr, k);

        for(int i : result2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
