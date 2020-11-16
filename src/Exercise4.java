import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un valor positivo: ");
        int x = scan.nextInt();
        int result;
        
        if (x<0){
            System.out.print("El valor ingresado no es valido");
        }
        
        else {
            for(int i=1; i<=10;i++){
                result = x*i;
                System.out.println(result);
            }
        }
    }
}
