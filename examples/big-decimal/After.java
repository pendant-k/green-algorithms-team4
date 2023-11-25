public class After {
    public static double calculateSimpleInterest(double principal, double rate, int years) {
        double interest = principal * rate * years;
        return interest;
    }

    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 0.05;
        int years = 5;

  //      System.out.println("After optimization:");
        double interest = calculateSimpleInterest(principal, rate, years);
//        System.out.println("Simple Interest: " + interest);
    }
}

