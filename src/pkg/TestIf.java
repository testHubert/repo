package pkg;

public class TestIf {
	public static void main(String[] args) {
		int zmienna = 16;	// zmiana z 5 na 16
		if (zmienna % 2 == 0)
			System.out.println("Liczba parzysta");
		else
			System.out.println("Liczba nieparzysta");
		if (zmienna > 10)
			System.out.println("Liczba wi�ksza od 10");
		else if (zmienna > 0 && zmienna <= 10)
			System.out.println("Liczba dodatnia mniejsza, lub r�wna 10");
		else
			System.out.println("Liczba ujemna");
	}
}