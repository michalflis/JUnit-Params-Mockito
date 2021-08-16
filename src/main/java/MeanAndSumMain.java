import java.util.List;

public class MeanAndSumMain {


    public static void main(String[] args) {

        List<Integer> listOfNumbers = List.of(1,2,3);

        MeanAndSum meanAndSum = new MeanAndSum(listOfNumbers);
        meanAndSum.calculateMeanAndSum();
    }
}
