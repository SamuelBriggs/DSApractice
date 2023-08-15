package Arrays.Two_Number_Sum;

import java.util.Arrays;

public class ApproachWithOlogN {

    static int[] initialArray = {3, 5, 8, 11, 1, -1, 6};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum(initialArray, 10)));

    }

    public static int[] twoNumberSum(int[] array, int targetSum){
        Arrays.sort(array);
        int startingPoint = 0;
        int endingPoint = array.length-1;

        while(startingPoint < endingPoint){
        if (array[startingPoint] + array[endingPoint] == targetSum) return new int[]{array[startingPoint], array[endingPoint]};
        else if (array[startingPoint] + array[endingPoint] < targetSum) startingPoint ++;
        else if(array[startingPoint] + array[endingPoint] > targetSum) endingPoint --;
        }
        return new int[0];
    }
}
