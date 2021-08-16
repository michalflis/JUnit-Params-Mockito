import java.util.List;

public class MeanAndSum {

    private List<Integer> listOfNumbers;

    public MeanAndSum(List<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }

    public void calculateMeanAndSum() {

        Runnable mean = () -> {
            int numberOfNumbers = listOfNumbers.size();
            int sumOfIntegers = listOfNumbers.stream().reduce(0, Integer::sum);
            int meanOfIntegers = sumOfIntegers / numberOfNumbers;
            System.out.println(meanOfIntegers);
        };

        Runnable sum = () -> {
            int sumOfIntegers = listOfNumbers.stream().reduce(0, Integer::sum);
            System.out.println(sumOfIntegers);
        };

        Thread firstThread = new Thread(mean);
        Thread secondThread = new Thread(sum);

        firstThread.start();
        secondThread.start();
    }

}



