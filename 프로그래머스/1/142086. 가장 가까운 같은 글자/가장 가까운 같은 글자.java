import java.util.Arrays;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] lastIndex = new int[26];
        Arrays.fill(lastIndex,-1);
        for(int i=0; i<s.length();i++){
            char a = s.charAt(i);
            int index = a - 'a';
            if(lastIndex[index]== -1){
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex[index];
            }
            lastIndex[index] = i;
        }
        return answer;
    }
        
}

