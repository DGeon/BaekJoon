import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str ="";
        if(a.length() >= 1 && a.length() <= 20){
            for(int i=0; i<a.length(); i++){
                char string = a.charAt(i);
                if( Character.isUpperCase(string) ) {
                    str += Character.toLowerCase(string);

                }else{
                    str += Character.toUpperCase(string);
                }
            }
        }
        System.out.println(str);
    }
}