public class StepTracker {
    private int steps;
    private int days;
    private int stepGoal;
    private int activeDays;

    public StepTracker(int stepGoal) {
        days = 0;
        this.stepGoal = stepGoal;
        steps = 0;
        activeDays = 0;
    }

    public void addDailySteps(int daily) {
        steps += daily;
        if (daily >= stepGoal) {
            activeDays++;
        }
        days++;
    }
    public double averageSteps() {
        if (days > 0){
            return ((double) steps) / days;
        }
        return 0.0;
    }
    public int activeDays() {
        return activeDays;
    }
}