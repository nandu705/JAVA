import java.util.Scanner;

public class Complex {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int real,imaginery;
        System.out.print("Enter the real part of the first comp no: ");
        int a1  = obj.nextInt();
        System.out.print("Enter the imaginery part of the first comp no: ");
        int b1  = obj.nextInt();
        System.out.print("Enter the real part of second comp no: ");
        int a2 = obj.nextInt();
        System.out.print("Enter the imaginery part of second comp no: ");
        int b2 = obj.nextInt();
        System.out.println(" ");
        real=a1+a2;
        imaginery=b1+b2;
        System.out.print("the sum of given complex number is : "+real+"+"+imaginery+"i");
        }
        }
        
        
        
