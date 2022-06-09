import java.util.Scanner;      // Scanner ki jagah * bhi likh sakte hai  !!!! 

// Print the sum of First n Natural Number
// n=4


public class table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number::\n");
        int n = sc.nextInt();
        System.out.println("_____________________________________________________________________________________");
        // int sum = 0;
        // for(int i = 1; i<=n; i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);

        for(int i = 1; i<=10; i++){
            System.out.println(n*i);
        }


    }
}