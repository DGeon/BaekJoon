import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = -100000;
        int max = 100000;
        
        if( (a >= min && a <= max) && (b >= min && b<=max) ){
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
