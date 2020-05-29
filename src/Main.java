import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Zadejte cislo v decimalni soustave: ");
		int decCislo = sc.nextInt();

		ArrayList<Character> hexArray = new ArrayList<>();
		hexArray.addAll(Convertor.toHexadecimal(decCislo));

		System.out.print("Cislo " + decCislo + " ma v hexadecimalni soustave hodnotu ");
		Convertor.toString(hexArray);

		System.out.println("\r\n");
		System.out.println("Zadejte cislo v hexademacimalni soustave: ");
		String hexCislo = sc.next();

		int cislo = Convertor.toDecimal(hexCislo);
		System.out.print("Cislo " + hexCislo + " ma v decimalni soustave hodnotu " + cislo);

		sc.close();
	}

}
