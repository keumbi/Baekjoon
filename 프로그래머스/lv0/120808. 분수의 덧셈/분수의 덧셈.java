class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        // (a*b) / (max)
        int[] answer = new int[2];
        
        int topNum = num1 * denum2 + num2 * denum1;
        int bottomNum = num1 * num2;
        int max = 1;
        
        for (int i = 1; i <= bottomNum && i <= topNum; i++) {
            if (bottomNum % i == 0 && topNum % i == 0) {
                max = i;
            }
        }
        answer[0] = topNum / max;
        answer[1] = bottomNum / max;
        
        return answer;
    }
}