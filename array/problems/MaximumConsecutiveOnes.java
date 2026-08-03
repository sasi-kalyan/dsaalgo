package problems;

public class MaximumConsecutiveOnes {

    public static int maximumConsecutiveOnes(int[] arr){

        int j = 0, max = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 1){
                j++;
            }else{
                j = 0;
            }
            max= Math.max(max, j);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1};

        int max = maximumConsecutiveOnes(arr);
        System.out.println(max);
    }
}
