import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> array = new ArrayList<>();
        for(int e :arr){
            if(e%divisor==0)
            array.add(e);
        }
        if(array.isEmpty()){
            array.add(-1);
        }
        Collections.sort(array);
        int[] answer = array.stream().mapToInt(i ->i).toArray();
        return answer;
    }
}