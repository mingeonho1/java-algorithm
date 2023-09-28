class Solution {
    public int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (n == sqrt * sqrt) ? 1 : 2;
    }
}