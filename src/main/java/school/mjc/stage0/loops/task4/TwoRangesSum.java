package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int summ = 0;
        if (lastInRow<numberToSkip){
           
            for (int i=0; i<lastInRow; i++){
                System.out.println("number to skip is bugger then the last");
                summ+=i;
            }
        }
        else if (lastInRow<0)
            System.out.println("number to skip is bugger then the last");
            else {
        
                for (int i=0; i<lastInRow; i++)
                    if (numberToSkip==i){
                    System.out.println("skipped sum is number");
                        continue;
                    }
                    else {
                        System.out.println("counted sum is number");
                        summ+=i;
                    }
            }
            System.out.println(summ);
    }
}
