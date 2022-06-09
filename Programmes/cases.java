import java.util.*;

public class cases{
    public static void main(String[] args) {
        System.out.println("Welcome to our Defination Center\nWhat you want define select among these");
        System.out.println("(1) Combination Reaction\n(2) Decomposition reaction");
        Scanner button = new Scanner(System.in);
        int a = button.nextInt();

        switch(a){
            case 1 : System.out.println("The reaction in which two or more Substances or compounds combine\ntogether to form a single compound are called combination reaction.\n_______________________________________________________________________________________________________________________________________");
            break;
            case 2 :System.out.println("Those reaction in which single substances splits into two or more simpler substances\nare known as Decomposition reaction.\n_______________________________________________________________________________________________________________________________________");
            break;
            default : System.out.println("Invalid button!!");
        }
        System.out.println("Type 1 for types of Decomposition reaction\nType 2 for exit");
        int b = button.nextInt();
        switch(b){
            case 1 : System.out.println("There are Three types of Decomposition reaction\n(1) Thermal decomposition\n(2) Electrolytic decomposition\n(3) Photo-decomposition");
            break;
            case 2 : System.out.println("Thank You ");
            break;
            default : System.out.println("Invalid button!!");
        }

    }
}