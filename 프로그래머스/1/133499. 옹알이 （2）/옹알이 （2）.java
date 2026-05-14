import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList("aya","ye","woo","ma"));
        for(String e : babbling) {
            int index = 0;
            String prev = "";
            boolean isPossible = true;
            while(index < e.length()) {
                boolean found =false;
                for(String s : list) {
                    if(e.startsWith(s,index)) {
                        if(prev.equals(s)) {
                            isPossible = false;
                            break;
                        } else {
                            index += s.length();
                            prev = s;
                            found = true;
                            break;
                        }
                    }
                }
                if(!found) {
                    isPossible =false;
                    break;
                }
                if(!isPossible) {
                    break;
                }
            }
            if(isPossible) {
                answer++;
            }
        }
        return answer;
    }
}