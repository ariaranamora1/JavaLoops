public class Exercise11 {
    public static void main(String[] args){

        int start = 25;
        int end = 50;
        System.out.println("Prime numbers between 25 and 50 are:");

        for(int i=start; i<=end; i++){
            int numOfFactors=0;

            for(int m=1;m<=i; m++) {
                if (i % m == 0)
                    numOfFactors++;
            }

                if(numOfFactors == 2){
                    System.out.println(i);
                }
        }
    }
}
