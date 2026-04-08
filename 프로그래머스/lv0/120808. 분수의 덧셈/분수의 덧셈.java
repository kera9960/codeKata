class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int top = numer1*denom2 + numer2*denom1;
        int bottom = denom1*denom2;
        int big;
        int small;
        int remain;
        if(top > bottom){
            big = top;
            small = bottom;
        } else {
            big = bottom;
            small = top;
        }
        while(small!=0){
            remain = big%small;
            big = small;
            small = remain;
        }
        answer[0] = top/big;
        answer[1] = bottom/big;
        return answer;
    }
}