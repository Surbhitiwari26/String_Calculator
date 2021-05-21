package co.incubyte;

public class StringCalculator {

	int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		} else {
			String[] number = numbers.split("//|,|\n|;|#|@");
			int j = 0;
			int num;
			for (int i = 0; i < number.length; i++) {
				if (!number[i].equals("")) {
					num = Integer.parseInt(number[i]);
					j = num + j;
				}
			}
			return j;
		}
	}
}
