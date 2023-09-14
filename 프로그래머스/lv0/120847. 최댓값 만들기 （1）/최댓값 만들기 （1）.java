import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] numbers) {
        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[0] * arr[1];
    }
}