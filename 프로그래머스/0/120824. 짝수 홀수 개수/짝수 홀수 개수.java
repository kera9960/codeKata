class Solution {
    public int[] solution(int[] num_list) {
        int[] even_odd_list = new int[2];
        int evenCount = 0;
        int oddCount = 0;
        for(int i =0; i<num_list.length;i++){
            if(num_list[i]%2 ==0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
        even_odd_list[0] = evenCount;
        even_odd_list[1] = oddCount;
        return even_odd_list;
    }
}