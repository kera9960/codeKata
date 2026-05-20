import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n];
        Arrays.fill(student,1);
        for(int e : lost) {
            student[e-1]--;
        }
        for(int e : reserve) {
            student[e-1]++;
        }
        for(int i = 0; i<n; i++) {
            if(student[i]==0) {
                if(i>0 && student[i-1]==2) {
                    student[i]++;
                    student[i-1]--;
                } else if(i<student.length-1 && student[i+1]==2) {
                    student[i]++;
                    student[i+1]--;
                }
            }
        }
        for(int e : student) {
            if(e>=1) {
                answer++;
            }
        }
        return answer;
    }
}