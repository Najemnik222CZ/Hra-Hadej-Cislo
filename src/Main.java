import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("H�dej ��slo od 0 do 1000");

		Scanner sc = new Scanner(System.in);
		int Cislo = sc.nextInt();

		Random x = new Random();

		int n = x.nextInt(1000) + 1;

		while (Cislo != n) {

			if (Cislo > n) {
				System.out.println("Mysl�m si men�� ��slo");
			} else {
				if (Cislo < n) {
					System.out.println("Mysl�m si v�t�� ��slo");
				}
			}
			System.out.println("Zadej nov� ��slo");
			Cislo = sc.nextInt();
		}

		if (Cislo == n) {
			System.out.println("�ikulka m� to ");
		}
	}
}
