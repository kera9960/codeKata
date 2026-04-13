import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String str = String.valueOf(n);
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        StringBuilder sb = new StringBuilder(new String(charArr));
        sb.reverse();
        long answer = Long.parseLong(sb.toString());
        return answer;
    }
}