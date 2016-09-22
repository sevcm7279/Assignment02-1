
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A2Q1 {
    public static int digitalSum(int a){
        if (a < 10){
            return a;
        }
        return digitalSum(a/10) + digitalSum(a%10);
    }
    public static int digitalRoot(int a){
        if (a < 10){
            return a;
        }
        return digitalSum(a/10) + digitalSum(a%10);
        }
    public static int triangleBlocks (int b){
        if (b == 0|b == 1){
            return b;
        }
        return b + triangleBlocks(b - 1);
    }
    public static int hailstone (int c){
        if (c == 0|c == 1){
            return c;
        }
        if (c % 2 == 0){
           System.out.println(c);
           return hailstone(c = c/2);
             
        }else{
        System.out.println(c);
        return hailstone(3*c + 1);
        }
    }
    public static int binaryConvert (int d){
        if (d == 0|d == 1){
            return d;
        }else{
            System.out.println(d % 2);
            return binaryConvert(d = d/2);
        }
        
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a scanner
        Scanner input = new Scanner(System.in);
        A2Q1 test = new A2Q1();
        
        // problem 1
        // tell the user to enter a number
        System.out.println("Enter a number");
        // store the number in int n
        int a = input.nextInt();
        // sout sum of digits
        System.out.println(test.digitalSum(a));        
        // store sum in a variable
        int problem1 = digitalSum(a);
        
        
        
        // problem two
        // store root of sum in a variable
        int problem2 = digitalRoot(problem1);        
        // print out the root
        System.out.println(problem2);
        
        
        
        // problem 3
        // ask user to enter the triangle row number
        System.out.println("Enter the row number");     
        // store the number in variable b
        int b = input.nextInt();
        // print out total blocks at that row
        System.out.println(triangleBlocks(b));
        
        
        
        // problem 4
        // ask the user to enter a number
        System.out.println("Enter a number");
        // store in a variable
        int c = input.nextInt();
        // activate method and sout answers
        System.out.println(hailstone(c));
        
        
        
        // problem 5
        // ask the user to enter a number
        System.out.println("Enter a number to convert into binary");
        // store the number in a variable
        int d = input.nextInt();
        // activate method and sout ansers
        System.out.println(binaryConvert(d));
        
        
        
        // problem 6
        // ask the user to enter a
    }
}