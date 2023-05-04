import java.io.*;
import java.util.Scanner;

public class SumPercentage {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        float sub1=sc.nextFloat();
        float sub2=sc.nextFloat();
        float sub3=sc.nextFloat();
        float sub4=sc.nextFloat();
        float sub5=sc.nextFloat();

        float c=0;
        c=sub1+sub2+sub3+sub4+sub5;

        System.out.println("the sum is" + c );

        float p=(c/500)*100;

        System.out.println("percentage is" + p );
    }
}

