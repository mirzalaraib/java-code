import java.io.*;
import java.util.Scanner;

public class Prime2 {
    public static void main(String[] arhs){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count ++;
                }
            }
            if(count==2){
                System.out.print(i + " ");
            }else{
                count=0;
            }
         }

    }
}
