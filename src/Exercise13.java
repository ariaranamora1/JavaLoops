import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int x = scan.nextInt();

        if (x < 0) {
            System.out.println("Los números negativos no tienen factorial");
        }
        if (x == 0) {
            System.out.println("El factorial de 0 es 1");
        }

        int result = 1;

        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                result = result * i;
            }

                System.out.print(x + "! =" +result);
            }
        }
    }

