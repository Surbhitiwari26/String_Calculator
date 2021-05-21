package co.incubyte;

public class StringCalculator {

	int Add(String numbers) {
		if (numbers.isEmpty()) {
			return 0;
		} else {
			String[] number = numbers.split("//|,|\\[|\\]|\n|;|#|@|\\*");
			String negNum = "";
			int j = 0;
			int num;
			for (int i = 0; i < number.length; i++) {
				if (!number[i].equals("")) {
					num = Integer.parseInt(number[i]);
					if (num >= 0 && num < 1001) {
						j = num + j;
					} else {
							if (num > 1000) {
							negNum = "";
						} else {
							if (negNum.equals("")) {
								negNum = String.valueOf(num);
							} else {
								negNum += ("," + String.valueOf(num));
							}
						}
					}
				}
			}
			if (!negNum.equals("")) {
				throw new IllegalArgumentException("Negatives not allowed: " + negNum);
			}
			return j;
		}
	}
}
