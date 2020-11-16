import java.util.Arrays;

public class Exercise15 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i;
        int m;

        for(i =1; i< numbers.length; i=i+2){
            m=numbers[i];
            System.out.println(m);
        }
    }
}

