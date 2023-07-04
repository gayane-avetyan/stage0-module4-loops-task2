package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number1= 2;
        while(number1 <= printToInclusive){
            boolean isPrime = true;
            int number2 = 2;

            while(number2 < number1){
                if(number1 % number2 == 0){
                    isPrime = false;
                    break;
                }
                number2++;
            }
            if(isPrime)
                System.out.println(number1);

            number1++;
        }
    }
}
