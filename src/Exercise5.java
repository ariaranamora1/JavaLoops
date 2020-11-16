public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int m;

        for(int i = 0; i<= numbers.length; i++){
            m = numbers[i];
            if(m>150){
                break;
            }
            else if(m%5==0){
                System.out.println(m);
            }
        }
    }
}
