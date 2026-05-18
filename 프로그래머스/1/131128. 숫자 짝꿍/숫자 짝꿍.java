import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] x = new int[10];
        int[] y = new int[10];
        for(int i = 0; i < X.length(); i++) {
            x[X.charAt(i)-'0']++;
        }
        for(int j = 0; j < Y.length(); j++) {
            y[Y.charAt(j)-'0']++;
        }
        for(int k = 9; k > -1 ; k--) {
            int count = Math.min(x[k],y[k]);
            for(int l = 0; l < count; l++) {
                sb.append(k);
            }
        }
        if(sb.length() ==0) {
            answer = "-1";
        } else if(sb.charAt(0)== '0') {
            answer = "0";
        } else {
            answer = sb.toString();
        }
        return answer;
    }
}