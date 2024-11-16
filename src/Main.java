public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.85; //рост
        int weight = 98; //вес
        int BMI = service.calculate(height, weight);
        System.out.println(BMI);
    }
}