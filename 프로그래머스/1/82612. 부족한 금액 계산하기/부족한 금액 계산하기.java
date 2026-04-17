class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalPrice = 0;
        for(int i =1; i<count+1;i++){
            totalPrice += price * i;
        }
        if(totalPrice <= money){
            return 0;
        }
        return Math.abs(money-totalPrice);
    }
}