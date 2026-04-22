class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wMax = 0;
        int hMax = 0;
        int w = 0;
        int h = 0;
        for(int i=0; i<sizes.length;i++){
            int a = sizes[i][0];
            int b = sizes[i][1];
            if(a<b){
                w = b;
                h = a;
            } else{
                w = a;
                h = b;
            }
            if(w>wMax){
                wMax = w;
            } 
            if(h>hMax){
                hMax = h;
            }
        }
        return wMax*hMax;
    }
}