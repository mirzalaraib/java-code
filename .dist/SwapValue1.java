import java.io.*;
import java.util.Scanner;

public class SwapValue1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("your first number is" + " " + a);
        System.out.println("your second number is" + " " + b);
    }
}
