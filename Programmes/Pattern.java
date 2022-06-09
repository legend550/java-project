// import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int m= sc.nextInt();

        /////////////////////////////////////////////         Solid Rectangle
        // //outer loop 
        int n =5;
        int m = 6;
        for(int i=1; i<=n; i++){
            // inner loop
            for(int a=1; a<=m; a++){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("______________________________________________________________________________________________________");

        //__________________________________________         Hollow Rectangle
        int k =4;
        int l =5;
      
        
        for(int i =1; i<=k; i++){
            for(int j=1; j<=l; j++){
                if (i == 1 || j == 1 || i == k || j== l){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();       //Dusre For loop mai aayega println wala.
        }
        System.out.println("______________________________________________________________________________________________________");


                    // Half pyramid
        int a = 5;
        for(int i =1; i<=a; i++ ){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println("______________________________________________________________________________________________________");

                    //  Inverted Half pyramid
        int b = 5;
        for(int i =b; i>=1; i-- ){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        System.out.println("______________________________________________________________________________________________________");

            // ek or ulta pyramid
        int t = 5;
        for(int i=1; i<=t; i++){
            for (int j=1 ; j<=t-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }      
    }   
}