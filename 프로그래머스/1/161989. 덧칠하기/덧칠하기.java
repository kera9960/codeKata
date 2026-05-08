class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paintedEnd = 0;
        for(int e : section){
            if(e > paintedEnd) {
                answer ++;
                paintedEnd = e + m -1;
            }
        }
        return answer;
    }
}