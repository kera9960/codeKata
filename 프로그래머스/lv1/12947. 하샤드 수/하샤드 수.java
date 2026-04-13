class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int b = 0;
        int y = x;
        int length = String.valueOf(Math.abs(x)).length();
        for(int i =0;i< length;i++){
            int a = x%10;
            x/= 10;
            b += a;
        }
        if(y%b ==0){
          return answer;
        } else{
            return !answer;
        }
    }
}