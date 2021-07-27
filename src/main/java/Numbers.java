public class Numbers {

    public boolean checkIfNumberCanBeDividedByTwo(int givenNumber) {
        return givenNumber % 2 == 0;

    }

    public int getSumOfDigits(int givenNumber) {
        int sumOfDigits = 0;

        while(givenNumber > 0){
            sumOfDigits += givenNumber % 10;
            givenNumber /= 10;

        }
        return sumOfDigits;

    }

}
