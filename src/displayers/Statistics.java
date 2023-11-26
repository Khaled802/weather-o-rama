package displayers;


public class Statistics {

    public static final double NOT_TRACKED = Integer.MIN_VALUE;

    private int num;
    private long sum;
    private double min;
    private double max;

    public Statistics() {
        num = 0;
        sum = 0;
        min = NOT_TRACKED;
        max = NOT_TRACKED;
    }

    public void setValue(double value) {
        sum += value;
        num++;

        this.updateMin(value);
        this.updateMax(value);
    }

    private void updateMin(double value) {
        if (min == NOT_TRACKED) min = value;
        min = Math.min(min, value);
    }

    private void updateMax(double value) {
        if (max == NOT_TRACKED) max = value;
        max = Math.max(max, value);
    }

    public double getAvg() {
        if (num == 0) return NOT_TRACKED;
        return sum / (double)num;
    }

    public double getMin() {
        return this.min;
    }

    public double getMax() {
        return max;
    }
}
