class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        if(length%2 ==0){
            String result1 = s.charAt(length/2-1) + ""; 
            String result2 = s.charAt(length/2) + "";
            answer = result1 + result2;
        } else{
        answer = s.charAt(length/2) + "";
        }
        return answer;
    }
}