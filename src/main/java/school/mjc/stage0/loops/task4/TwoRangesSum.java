package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int summ = 0,sum2=0, j=1;
        if (lastInRow<numberToSkip){
            System.out.println("number to skip is bugger then the last");
        }
        else if (lastInRow<0)
            System.out.println("number to skip is bugger then the last");
            else {
                System.out.println("number to skip is bugger then the last");
                for (int i = 0; i<=numberToSkip; i++){
                    summ+=i;
                    j=i;
                }
                    
                for (int i=j; i<=numberToSkip; i++) 
                    sum2+=i;
                System.out.println("skipped sum is "+summ);
                System.out.println("counted sum is "+sum2);
                }
    }
}
