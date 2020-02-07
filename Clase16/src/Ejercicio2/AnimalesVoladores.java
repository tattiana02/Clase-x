package Ejercicio2;

public class AnimalesVoladores extends Animales{

	private String colorplumas;
	private int tama�o;
	boolean migrante;
	
	public AnimalesVoladores(String nombre, String paisOrigen, String fechaIngreso, String colorPlumas, int tama�o, boolean migrante) {
		super(nombre, paisOrigen, fechaIngreso);
		this.colorplumas = colorPlumas;
		this.tama�o = tama�o;
		this.migrante = migrante;
			
	}

	public String getColorplumas() {
		return colorplumas;
	}

	public void setColorplumas(String colorplumas) {
		this.colorplumas = colorplumas;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public boolean isMigrante() {
		return migrante;
	}

	public void setMigrante(boolean migrante) {
		this.migrante = migrante;
	}

	@Override
	public String toString() {
		return "AnimalesVoladores [colorplumas=" + colorplumas + ", tama�o=" + tama�o + ", migrante=" + migrante + "]";
	}
	
}