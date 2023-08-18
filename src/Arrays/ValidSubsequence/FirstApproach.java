package Arrays.ValidSubsequence;

import java.util.List;
import java.util.Objects;

public class FirstApproach {
    public static void main(String[] args) {
        System.out.println(isValidSubsequence(List.of(5, 1, 22, 25, 6,-1,8,10), List.of(1, 6,-1, 10)));
    }

    public static boolean isValidSubsequence(List<Integer> mainArray, List<Integer> subArray){
        int pos = 0;
        int size = 0;
        for (Integer integer : mainArray) {
            if (Objects.equals(integer, subArray.get(pos))) {
                pos++;
                size++;
            }
        }
        return size == subArray.size();
    }

}
