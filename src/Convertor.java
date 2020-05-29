import java.util.ArrayList;

public class Convertor {

	public static ArrayList<Character> toHexadecimal(int decCislo) {
		ArrayList<Character> hexArray = new ArrayList<>();

		while (decCislo != 0) {
			int temp = 0;
			temp = decCislo % 16;

			if (temp < 10) {
				hexArray.add((char) (temp + 48));
			} else {
				hexArray.add((char) (temp + 55));
			}

			decCislo = decCislo / 16;
		}
		return hexArray;
	}

	public static void toString(ArrayList<Character> hexArray) {
		for (int i = hexArray.size() - 1; i >= 0; i--) {
			System.out.print(hexArray.get(i));
		}
	}

	public static int toDecimal(String hexCislo) {
		int decCislo = 0;
		int rad = 1;

		for (int i = hexCislo.length() - 1; i >= 0; i--) {
			if (hexCislo.charAt(i) >= '0' && hexCislo.charAt(i) <= '9') {
				decCislo = decCislo + (hexCislo.charAt(i) - 48) * rad;
				rad = rad * 16;
			} else if (hexCislo.charAt(i) >= 'A' && hexCislo.charAt(i) <= 'F') {
				decCislo = decCislo + (hexCislo.charAt(i) - 55) * rad;
				rad = rad * 16;
			}
		}
		return decCislo;
	}

}
