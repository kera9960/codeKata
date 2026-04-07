import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> baskets = new ArrayList<>();
        int N =sc.nextInt();
        int M =sc.nextInt();

        for (int a =1;a<N+1;a++){
            baskets.add(a);
        }
        for (int a =0;a<M;a++){
            int i =sc.nextInt();
            int j =sc.nextInt();
            Collections.reverse(baskets.subList(i-1,j));
        }
        String result = baskets.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}