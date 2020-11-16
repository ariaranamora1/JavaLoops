public class Exercise12 {
    public static void main(String[] args){

        int newNum;
        int numOne=0;
        int numTwo=1;

        for(int i=1; i<=10; i++){
            newNum=numOne+numTwo;
            System.out.print(numOne + " ");

            numOne=numTwo;
            numTwo=newNum;
        }
    }
}
