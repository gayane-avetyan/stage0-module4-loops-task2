package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int res = 1;
        if(power < 0){
            System.out.println("too much power");
        }
        else{
            System.out.println(res);
            while(res <= power * 2){
                res *= 2;
                System.out.println(res);
            }
        }

    }
}
