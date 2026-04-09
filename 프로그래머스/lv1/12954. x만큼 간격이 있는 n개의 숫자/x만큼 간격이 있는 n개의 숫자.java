class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long y =(long)x;
        for(int i=0;i<n;i++){
            answer[i] = y;
            y += answer[0];
        }
        return answer;
    }
}