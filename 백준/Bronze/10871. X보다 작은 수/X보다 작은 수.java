import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i=0;i <N;i++){
            A[i] = Integer.parseInt(st1.nextToken());
            if (A[i]<X){
                bw.write(Integer.toString(A[i])+" ");
            }
        }
        bw.flush();
    }
}
