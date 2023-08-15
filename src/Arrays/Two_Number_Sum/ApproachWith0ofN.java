package Arrays.Two_Number_Sum;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ApproachWith0ofN {


    static int[] initialArray = {2, 5, 8, 11, 1, -1, 6};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoNumberSum(initialArray, 10)));
    }

    public static int[] twoNumberSum(int[] array, int targetSum){
        Set<Integer> arrays = new HashSet<>();
        System.out.println(arrays);
        for (int j : array) {
            int correctSum = targetSum - j;
            if (arrays.contains(correctSum)) return new int[]{correctSum, j};
            else arrays.add(j);
        }
        return new int[0];
    }



}
