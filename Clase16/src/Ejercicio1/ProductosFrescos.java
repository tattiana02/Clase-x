package Ejercicio1;

public class ProductosFrescos extends Producto {

	public ProductosFrescos(String fechaCaducidad, int nueroLote, String paisOrigen, String fechaEnvasado) {
		super(fechaCaducidad, nueroLote, paisOrigen, fechaEnvasado);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String toString() {
		return "ProductosFrescos [getFechaCaducidad()=" + getFechaCaducidad() + ", getNumeroLote()=" + getNumeroLote()
				+ ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaEnvasado()=" + getFechaEnvasado()
				+ ", getClass()=" + getClass() + "]";
	}
}
