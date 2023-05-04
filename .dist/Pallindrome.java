import java.io.*;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check");
        int n=sc.nextInt();
        int l=n;
        int m=0;
        int r;
        while(n!=0){
        r=0;
        r=n%10;
        m=(m*10)+r;
        System.out.print(r);
        n=n/10;
        }
          if(m==l){
             System.out.println("pallindrome");
          }
          else{
            System.out.println("not pallindrome");
          }
    }
}
