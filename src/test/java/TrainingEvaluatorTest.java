import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TrainingEvaluatorTest {

    @ParameterizedTest
    @CsvSource(value = {"0:1", "25:1", "30:2", "45:2", "60:2", "65:3" }, delimiter = ':')
    void shouldEvaluateLengthOfTraining (int timeOfTrainingInMinutes, int expected) {
        //given
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator();

        //when
        int result = trainingEvaluator.evaluateLengthOfTraining(timeOfTrainingInMinutes);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"0:1", "250:1", "300:1", "350:2", "400:3", "450:3" }, delimiter = ':')
    void shouldEvaluateAmountOfCaloriesBurned (int caloriesBurned, int expected) {
        //given
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator();

        //when
        int result = trainingEvaluator.evaluateAmountOfCaloriesBurned(caloriesBurned);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"0:3", "150:3", "160:2", "175:2", "180:1", "200:1" }, delimiter = ':')
    void shouldEvaluateAverageHeartRate (int averageHeartRate, int expected) {
        //given
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator();

        //when
        int result = trainingEvaluator.evaluateAverageHeartRate(averageHeartRate);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"0:0:180:Niska efektywność", "25:350:180:Dobra efektywność", "65:350:170:Bardzo dobra efektywność", "65:400:150:Doskonała efektywność" }, delimiter = ':')
    void shouldEvaluateTrainingEfficiency(int timeOfTrainingInMinutes, int caloriesBurned, int averageHeartRate, String expected) {
        //given
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator();

        //when
        String result = trainingEvaluator.evaluateTrainingEfficiency(timeOfTrainingInMinutes, caloriesBurned, averageHeartRate);

        //then
        Assertions.assertEquals(expected, result);

    }

}