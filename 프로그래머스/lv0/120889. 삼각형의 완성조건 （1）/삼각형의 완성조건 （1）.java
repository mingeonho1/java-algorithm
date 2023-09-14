import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Integer[] arr = Arrays.stream(sides).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[0] < arr[1] + arr[2] ? 1 : 2;
    }
}