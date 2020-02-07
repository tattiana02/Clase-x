package Ejercicio1;

public class ProductosCongelados extends Producto {

	private double temperaturaMatenimiento;

	public ProductosCongelados(String fechaCaducidad, int nueroLote, String paisOrigen, String fechaEnvasado, double temperaturaMantenimiento) {
		super(fechaCaducidad, nueroLote, paisOrigen, fechaEnvasado);
		this.temperaturaMatenimiento = temperaturaMantenimiento;
	}

	public double getTemperaturaMatenimiento() {
		return temperaturaMatenimiento;
	}

	public void setTemperaturaMatenimiento(double temperaturaMatenimiento) {
		this.temperaturaMatenimiento = temperaturaMatenimiento;
	}

	@Override
	public String toString() {
		return "ProductosCongelados [temperaturaMatenimiento=" + temperaturaMatenimiento + super.toString() + "]";
	}
}
