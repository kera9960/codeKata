import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int[] baskets = new int[N];
        for (int a = 1; a<N+1;a++){
            baskets[a-1] = a;
        }

        int ballSwitch = 0;
        for (int a =0; a<M;a++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
               int i = Integer.parseInt(st2.nextToken());
               int j = Integer.parseInt(st2.nextToken());
               ballSwitch = baskets[i-1];
               baskets[i-1] = baskets[j-1];
               baskets[j-1] = ballSwitch;
        }

        for (int i = 0; i<N;i++){
            String d = Integer.toString(baskets[i]);
            bw.write(d+" ");
        }
        bw.flush();
        bw.close();
    }
}