import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int x = scan.nextInt();
        int digits=0;

        while(x>0){
            x=x/10;
            digits++;
        }
       System.out.print(digits);
    }
}
