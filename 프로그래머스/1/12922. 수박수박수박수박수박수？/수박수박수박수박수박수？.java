class Solution {
    public String solution(int n) {
        String answer = "";
        String A = "수박수";
        if(n%2 == 1){
            answer = A.charAt(0)+"";
            for(int i =0;i<n/2;i++){
                answer += A.charAt(1)+""+A.charAt(0)+"";
            }
        } else if(n%2 ==0){
            for(int i =0; i<n/2;i++){
           answer += A.charAt(0)+"" +A.charAt(1)+"";}
        }
        return answer;
    }
}