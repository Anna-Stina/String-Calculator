
public class Calculator {

	public int add(String str) {
		if (str.equals("")) {
			return 0;

		}

		String[] strArray = str.split(",");
		int summa = 0;
		for (String s : strArray) {
			int parsed = Integer.parseInt(s);
			summa = summa + parsed;
		}
		return summa;
	}

}
