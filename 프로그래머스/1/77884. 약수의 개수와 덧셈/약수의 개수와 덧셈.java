class Solution {
public int solution(int left, int right) {
    int answer = 0;
    for(int a = left; a<right+1;a++){
        int count = 0;
        for(int i =1;i<a+1;i++){
            if(a%i ==0){
                count++;
            }
        }
        if(count%2==0) answer += a;
            else if(count%2 ==1) answer -=a;
     }
        return answer;
    }
}