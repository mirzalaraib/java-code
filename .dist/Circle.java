import java.io.*;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter radius");
       float r=sc.nextFloat();
       float pi=3.14f;

       float area=pi*r*r;
       System.out.println("area is" + " " + area);
       float c=2*pi*r;
       System.out.println("conference is" + " " + c);

       
    }   
}
