class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = (long) num;
        if(num ==1){
                return answer;
            }
        while(true){
            if(num2%2 ==0){
               num2 = num2/2;
            } else {
               num2 = num2*3 + 1;
            }
            answer++;
            if(answer >=500){
                return -1;
            } else if(num2 ==1){
                return answer;
            }
        }
    }
}