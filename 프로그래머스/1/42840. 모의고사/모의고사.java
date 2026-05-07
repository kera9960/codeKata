import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
        int person1Answer = 0;
        int person2Answer = 0;
        int person3Answer = 0;
        for(int i = 0; i<answers.length; i++) {
            if(answers[i] == person1[i%person1.length]){
                person1Answer ++;
            }
            if(answers[i] == person2[i%person2.length]){
                person2Answer ++;
            }
            if(answers[i] == person3[i%person3.length]){
                person3Answer ++;
            }
        }
        int max = Math.max(person1Answer,Math.max(person2Answer,person3Answer));
        if(max==person1Answer){
            answer.add(1);
        }
        if(max==person2Answer){
            answer.add(2);
        }
        if(max==person3Answer){
            answer.add(3);
        }       
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}