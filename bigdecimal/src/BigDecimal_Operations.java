import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_Operations {

    // Method to round a BigDecimal to the nearest hundredth and return as double
    public static double roundToNearestHundredth(BigDecimal number) {
        // Set scale to 2 decimal places and use RoundingMode.HALF_UP to round to the nearest hundredth
        BigDecimal roundedNumber = number.setScale(2, RoundingMode.HALF_UP);
        // Convert the BigDecimal to a double
        return roundedNumber.doubleValue();
    }

    // Method to reverse the sign of a BigDecimal, round to the nearest tenth, and return the result
    public static BigDecimal reverseSignAndRoundToNearestTenth(BigDecimal number) {
        // Reverse the sign of the BigDecimal
        BigDecimal reversedNumber = number.negate();
        // Round the number to the nearest tenth
        BigDecimal roundedNumber = reversedNumber.setScale(1, RoundingMode.HALF_UP);
        // Return the resulting BigDecimal
        return roundedNumber;
    }

    public static void main(String[] args) {
        // Test the roundToNearestHundredth method
        BigDecimal number1 = new BigDecimal("4.2545");
        double result1 = roundToNearestHundredth(number1);
        System.out.println("Rounded to nearest hundredth: " + result1);  // Should print: 4.25

        // Test the reverseSignAndRoundToNearestTenth method
        BigDecimal number2 = new BigDecimal("1.2345");
        BigDecimal result2 = reverseSignAndRoundToNearestTenth(number2);
        System.out.println("Reversed and rounded to nearest tenth: " + result2);  // Should print: -1.2

        BigDecimal number3 = new BigDecimal("-45.67");
        BigDecimal result3 = reverseSignAndRoundToNearestTenth(number3);
        System.out.println("Reversed and rounded to nearest tenth: " + result3);  // Should print: 45.7
    }
}
