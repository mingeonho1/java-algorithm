class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for (char s :str.toCharArray()) {
            answer += Integer.valueOf(String.valueOf(s));
        }
        return answer;
    }
}