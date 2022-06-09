// Made by Keshav Kumar.

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number");
        int b = sc.nextInt();
        System.out.print("+   ");
        System.out.print("-   ");
        System.out.print("/   ");
        System.out.print("*   ");
        System.out.println("Enter Your Operation");
        String  c = sc.next();

        switch(c){
            case "+" : System.out.print("Your Answer is =====>  "); 
            System.out.print(a+b);            
            break;
            case "-" : System.out.print("Your Answer is =====>  ");
            System.out.println(a-b);
            break;
            case "/" : if (b==0){
                System.out.println("Invalid Division");
            }else {
                System.out.print("Your Answer is =====>  ");
                System.out.println(a/b);
            }
            
            break;
            case "*" : System.out.print("Your Answer is =====>  ");
            System.out.println(a*b);
            break;

        }



    }
}
