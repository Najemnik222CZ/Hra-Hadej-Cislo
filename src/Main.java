import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hádej Èíslo od 0 do 1000");

		Scanner sc = new Scanner(System.in);
		int Cislo = sc.nextInt();

		Random x = new Random();

		int n = x.nextInt(1000) + 1;

		while (Cislo != n) {

			if (Cislo > n) {
				System.out.println("Myslím si menší èíslo");
			} else {
				if (Cislo < n) {
					System.out.println("Myslím si vìtší èíslo");
				}
			}
			System.out.println("Zadej nové èíslo");
			Cislo = sc.nextInt();
		}

		if (Cislo == n) {
			System.out.println("Šikulka máš to ");
		}
	}
}
