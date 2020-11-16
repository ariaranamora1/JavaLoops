public class Exercise14 {
    public static void main(String[] args) {

        int givenNum =76542;
        int reverse=0;
        while(givenNum != 0) {
            int num = givenNum%10;
            reverse = (reverse*10)+num;
            givenNum= givenNum / 10;
        }
        System.out.println(reverse);
    }
}
