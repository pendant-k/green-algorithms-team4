import java.math.BigDecimal;

public class Before {
    public static BigDecimal calculateSimpleInterest(BigDecimal principal, BigDecimal rate, int years) {
        BigDecimal interest = principal.multiply(rate).multiply(new BigDecimal(years));
        return interest;
    }

    public static void main(String[] args) {
        BigDecimal principal = new BigDecimal("10000");
        BigDecimal rate = new BigDecimal("0.05");
        int years = 5;

  //      System.out.println("Before optimization:");
        BigDecimal interest = calculateSimpleInterest(principal, rate, years);
//        System.out.println("Simple Interest: " + interest);
    }
}

