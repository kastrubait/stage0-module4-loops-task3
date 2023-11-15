package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstTerm = 0, secondTerm = 1;
        int whileCounter = 2;

//        for (int i = 1; i <= n; ++i) {
        while (whileCounter  <= lastFibonacci){
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            whileCounter++;
        }
    }
}
