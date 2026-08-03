package problems;

import java.util.Arrays;

public class UnionTwoSortedArrays {

    public static int[] unionTwoSortedArrays(int[] arr1, int[] arr2){

        int[] temp = new int[arr1.length + arr2.length];

        int n1 = arr1.length;
        int n2 = arr2.length;
        int m = Math.min(n1, n2), n = 0;
        int i = 0, j = 0, k = 0;

        while (n < m){

            if(arr1[i] < arr2[j] && arr1[i] != (k == 0 ? -1 : temp[k-1])){
                temp[k] = arr1[i];
                i++;
                k++;
            } else if(arr2[j] != (k == 0 ? -1 : temp[k-1])) {
                temp[k] = arr2[j];
                j++;
                k++;
            }

            n++;
        }

        while (i < n1){
            temp[k] = arr1[i];
            i++;
            k++;
        }

        while ((j < n2)){
            temp[k] = arr2[j];
            j++;
            k++;
        }

        return temp;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5, 6};

        int[] res = unionTwoSortedArrays(arr1, arr2);

        for(int i : res){
            System.out.print(i + " ");
        }
    }
}
