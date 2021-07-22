public class TrainingEvaluator {

    public int evaluateLengthOfTraining (int timeOfTrainingInMinutes) {
        if (timeOfTrainingInMinutes < 30) {
            return 1;
        } else if (timeOfTrainingInMinutes <=60) {
            return 2;
        } else {
            return 3;
        }
    }

    public int evaluateAmountOfCaloriesBurned (int caloriesBurned) {
        if (caloriesBurned <= 300) {
            return 1;
        } else if (caloriesBurned < 400) {
            return 2;
        } else {
            return 3;
        }
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

    public String evaluateTrainingEfficiency (int timeOfTrainingInMinutes, int caloriesBurned, int averageHeartRate) {
        double trainingScore = (evaluateLengthOfTraining(timeOfTrainingInMinutes) +
                evaluateAmountOfCaloriesBurned(caloriesBurned) * 2 +
                evaluateAverageHeartRate(averageHeartRate) * 3) / (double) 6;
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
