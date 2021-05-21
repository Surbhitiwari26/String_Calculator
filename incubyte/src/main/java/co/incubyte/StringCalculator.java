package co.incubyte;

public class StringCalculator {

	int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		} else {
			int num;
			num = Integer.parseInt(numbers);		
			return num;
		}
	}
}
