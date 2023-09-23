class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String intStr = my_string.replaceAll("[^0-9]", "");
        for (char c: intStr.toCharArray()) {
            answer += Character.getNumericValue(c);
        }
        return answer;
    }
}