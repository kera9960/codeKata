class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int i;
        while(n>=a){
            i = n/a;
            n = n%a + i*b;
            answer += i*b;
        }
        return answer;
    }
}
