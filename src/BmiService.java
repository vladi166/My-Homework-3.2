public class BmiService {
    public int calculate(double height, int weight) {
        double BMI = weight / (height * height);
        return (int) BMI;
    }
}
