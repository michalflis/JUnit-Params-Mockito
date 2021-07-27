public class TrainingEvaluator {

    public int evaluateTrainingParameter (int inputParameter, int lowerLimit, int higherLimit) {
        if (inputParameter <= lowerLimit) {
            return 1;
        } else if (inputParameter < higherLimit) {
            return 2;
        } else {
            return 3;
        }
    }

    public int evaluateLengthOfTraining (int timeOfTrainingInMinutes) {
        return evaluateTrainingParameter(timeOfTrainingInMinutes, 29, 61);
    }

    public int evaluateAmountOfCaloriesBurned (int caloriesBurned) {
        return evaluateTrainingParameter(caloriesBurned, 300, 400);
    }

    public int evaluateAverageHeartRate (int averageHeartRate) {
        if (averageHeartRate < 160) {
            return 3;
        } else if (averageHeartRate <= 175) {
            return 2;
        } else {
            return 1;
        }
    }

    public double evaluateTrainingEfficiency (int timeOfTrainingInMinutes, int caloriesBurned, int averageHeartRate) {

        return  (evaluateLengthOfTraining(timeOfTrainingInMinutes) +
                evaluateAmountOfCaloriesBurned(caloriesBurned) * 2 +
                evaluateAverageHeartRate(averageHeartRate) * 3) / (double) 6;

    }
     public String convertTrainingEfficiencyScoreToMessage(double trainingScore) {

         if (trainingScore < 1.2) {
             return "Niska efektywność";
         } else if (trainingScore < 2) {
             return "Dobra efektywność";
         } else if (trainingScore < 3) {
             return "Bardzo dobra efektywność";
         } else {
             return "Doskonała efektywność";
         }

    }

}
