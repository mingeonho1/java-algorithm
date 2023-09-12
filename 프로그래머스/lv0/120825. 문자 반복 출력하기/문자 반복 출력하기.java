class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder builder = new StringBuilder();
        for (char c: my_string.toCharArray()) {
            for(int i = 0; i < n; i++) {builder.append(c);}
        }
        
        return builder.toString();
    }
}