public class Exercise2 {
    public static void main(String[] args) {
        int rows=5;

        for (int i=1; i<=rows; i++) {
            for (int m=1; m<=i; m++){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
