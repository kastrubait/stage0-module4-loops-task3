package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int summ = 0;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int number = 9;

            for (int j = 2; j <= i; j++) {
                number = number * 10 + 9;
            }

            summ += number;
        }
        System.out.println(summ);

    }
}
