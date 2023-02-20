class Solution {
    public int solution(int n) {
        int answer = 0;
        int min = 0;
        
        if (1 <= n && n <= 100) {
            for (int i = 1; i <= n && i <= 6; i++) {
                if (n % i == 0 && 6 % i == 0) {
                    min = i;
                }
            }
            answer = n * 6 / min / 6;
        }
        return answer;
    }
}