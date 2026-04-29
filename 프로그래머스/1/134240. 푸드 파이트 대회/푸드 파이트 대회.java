class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder a = new StringBuilder();
        for(int i =1;i<food.length;i++){
            int count = food[i]/2;
            for(int j =0;j<count;j++){
                a.append(i);
            }
        }
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        answer = a+"0"+b;
        return answer;
    }
}
