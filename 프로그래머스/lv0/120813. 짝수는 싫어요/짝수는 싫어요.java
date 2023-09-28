class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n / 2 + n % 2];
        int t = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                answer[t] = i;
                t++;
            }
        }
        return answer;
    }
}