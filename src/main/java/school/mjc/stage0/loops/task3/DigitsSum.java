package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = Math.abs(t);
        while(t != 0){
            sum += (t % 10);
            t/=10;
        }

//        for(t = sr.nextInt(); t != 0; t /= 10)
//        {
//            sum += (t % 10);
//        }

        System.out.println(sum);

    }
}
