import java.util.Random;

/**
 * Main class.
 * Start point for all operations
 *
 * @author Petrov-OYu
 */
public class Main {
	private static int arrayQuantity = 100000000;
	private static double maxDoubleValue = 10.0;
	private static double minDoubleValue = -0.1;

	/**
	 * Start point for all operations
	 */
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < arrayQuantity; i++) {
			double random = minDoubleValue + (new Random().nextDouble() * (maxDoubleValue - minDoubleValue));
			specificActionWithSQRT(random);
		}
	}

	private static void specificActionWithSQRT(double value) throws Exception {
		Double sqrtValue = Math.sqrt(value);

		if (sqrtValue.isNaN()) {
			throw new Exception("value " + value + " less than zero");
		}

		if (Math.round(sqrtValue * sqrtValue) == value) {
			System.out.println(value);
		}
	}
}
