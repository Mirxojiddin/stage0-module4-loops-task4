package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int summ = 0,sum2=0, j=1;
        if (lastInRow<numberToSkip){
            if (lastInRow<0)
                System.out.print("last number in row is negative");
            else 
            System.out.print("number to skip is bigger then the last");
        }
        else {
                for (int i = 1; i<=numberToSkip; i++){
                    summ+=i;
                    j=i;
                }
                    
                for (int i=j+1; i<=lastInRow; i++) 
                    sum2+=i;
                System.out.println("skipped sum is "+summ);
                System.out.println("counted sum is "+sum2);
                }
    }
    public static void main(String[] args) {
        TwoRangesSum twoRangesSum = new TwoRangesSum();
        twoRangesSum.printSumOfTwoRanges(10, 10);
    }
}
