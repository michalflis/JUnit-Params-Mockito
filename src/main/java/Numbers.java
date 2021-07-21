public class Numbers {

    public boolean checkIfNumberCanBeDividedByTwo(int givenNumber) {
        return givenNumber % 2 == 0;

    }

    public int getSumOfDigits(int givenNumber) {
        int numberOfDigits = String.valueOf(givenNumber).length();
        int sumOfDigits = 0;
        int[] arrayOfDigits = new int[numberOfDigits];

        for (int i = 0; i <= numberOfDigits - 1; i++){
            arrayOfDigits[i] = givenNumber / (int)Math.pow(10, numberOfDigits - 1 - i);
            givenNumber = givenNumber - (int)Math.pow(10, numberOfDigits - 1 - i) * arrayOfDigits[i];
            sumOfDigits = sumOfDigits + arrayOfDigits[i];

        }
        return sumOfDigits;

    }

}
