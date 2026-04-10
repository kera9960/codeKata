import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String a = "abcdefghijklmnopqrstuvwxyz";
        for(int i =0; i<a.length();i++){
          int b =  S.indexOf(a.charAt(i));
            System.out.print(b+" ");
        }

    }
}
