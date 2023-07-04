package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int firstPrinted = 0;
        while(firstPrinted <= lastPrinted){
            System.out.println(firstPrinted++);
        }
    }
}
