class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String sub1 = phone_number.substring(0,length-4);
        String sub2 = phone_number.substring(length-4,length);
        String result = sub1.replaceAll(".","*");
        answer = result+ sub2;
        return answer;
    }
}