package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 1;
        int factorial = 1;
        while(number <= printToInclusive + 1){
            System.out.println(factorial);
            factorial *= number;
            number++;
        }
    }
}
