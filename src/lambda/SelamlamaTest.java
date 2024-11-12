package lambda;

public class SelamlamaTest {

	public static void main(String[] args) {

		Selamlama turkceSelamlama = (kimi) -> System.out.println("Merhaba " + kimi);
		Selamlama ingilizceSelamlama = (kimi) -> System.out.println("Hello");
		Selamlama almancaSelamlama = (kimi) -> System.out.print("Hallo");
		
		SelamlamaYap(turkceSelamlama , "Ahmet");
		SelamlamaYap(ingilizceSelamlama , "John");
		SelamlamaYap(almancaSelamlama , "Hans");
		
	}

	private static void SelamlamaYap(Selamlama selamlama, String isim) {
		selamlama.selamla(isim);
	}

}
