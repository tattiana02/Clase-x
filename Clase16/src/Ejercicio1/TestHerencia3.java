package Ejercicio1;

public class TestHerencia3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductosFrescos pFrescos1 = new ProductosFrescos("29-10-2020", 123, "China","01-01-2020");
		System.out.println(pFrescos1.toString());
		
		ProductosFrescos pFrescos2 = new ProductosFrescos("02-07-2020", 124, "Japon","01-02-2020");
		System.out.println(pFrescos2.toString());
		
		ProductosRefrigerados pRefrigerados1 = new ProductosRefrigerados("29-10-2020", 125, "Mosambique","01-01-2020", 4,5);
		System.out.println(pRefrigerados1.toString());
		
		ProductosRefrigerados pRefrigerados2 = new ProductosRefrigerados("02-07-2020", 126, "Polonia","01-02-2020", 1,5);
		System.out.println(pRefrigerados2.toString());
		
		ProductosRefrigerados pRefrigerados3 = new ProductosRefrigerados("29-10-2020", 127, "Alemania","01-01-2020", 3,5);
		System.out.println(pRefrigerados3.toString());
		
		ProductosCongelados pCongelados1 = new ProductosCongelados("02-07-2020", 128, "Francia","01-02-2020", 5.6);
		System.out.println(pCongelados1.toString());
	}

}
