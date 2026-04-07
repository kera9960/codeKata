import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> check = new HashSet<>();

        for (int i =0;i<10;i++){
            int a = sc.nextInt();
            check.add(a%42);
        }
        System.out.println(check.size());
    }
}
