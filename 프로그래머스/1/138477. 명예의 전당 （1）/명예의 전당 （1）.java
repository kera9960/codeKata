import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> fame = new ArrayList<>();
        for(int i = 0; i<score.length;i++){
            fame.add(score[i]);
            Collections.sort(fame);
            if(fame.size()>k){
                fame.remove(0);
            }
            answer[i] = fame.get(0);
        }
        return answer;
    }
}