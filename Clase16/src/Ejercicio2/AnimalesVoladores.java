package Ejercicio2;

public class AnimalesVoladores extends Animales{

	private String colorplumas;
	private int tamaño;
	boolean migrante;
	
	public AnimalesVoladores(String nombre, String paisOrigen, String fechaIngreso, String colorPlumas, int tamaño, boolean migrante) {
		super(nombre, paisOrigen, fechaIngreso);
		this.colorplumas = colorPlumas;
		this.tamaño = tamaño;
		this.migrante = migrante;
			
	}

	public String getColorplumas() {
		return colorplumas;
	}

	public void setColorplumas(String colorplumas) {
		this.colorplumas = colorplumas;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isMigrante() {
		return migrante;
	}

	public void setMigrante(boolean migrante) {
		this.migrante = migrante;
	}

	@Override
	public String toString() {
		return "AnimalesVoladores [colorplumas=" + colorplumas + ", tamaño=" + tamaño + ", migrante=" + migrante + "]";
	}
	
}