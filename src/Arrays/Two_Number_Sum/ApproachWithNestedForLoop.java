package Arrays.Two_Number_Sum;

import java.util.Arrays;

public class ApproachWithNestedForLoop {

    static int[] initialArray = {3, 5, 8, 11, 1, -1, 6};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum(initialArray, 10)));

    }

    public static int[] twoNumberSum(int[] array, int targetSum){
        int[] returnedArray = new int[2];
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] + array[j] == targetSum) {returnedArray[0] = array[i]; returnedArray[1] = array[j];
                    break;}
            }
        }

        return returnedArray;
    }
}
