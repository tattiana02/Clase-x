package Ejercicio2;

public class AnimalesTerrestres extends Animales {
	
	private int cantidadPatas;
	private String tipoAlimentacion;
	private String horasSueño;
	
	public AnimalesTerrestres(String nombre, String paisOrigen, String fechaIngreso, int cantidadPatas, String tipoAlimentacion, String horasSueño) {
		super(nombre, paisOrigen, fechaIngreso);
		this.cantidadPatas = cantidadPatas;
		this.tipoAlimentacion = tipoAlimentacion;
		this.horasSueño = horasSueño;
		
	}

	public int getCantidadPatas() {
		return cantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public String getHorasSueño() {
		return horasSueño;
	}

	public void setHorasSueño(String horasSueño) {
		this.horasSueño = horasSueño;
	}

	@Override
	public String toString() {
		return "AnimalesTerrestres [cantidadPatas=" + cantidadPatas + ", tipoAlimentacion=" + tipoAlimentacion
				+ ", horasSueño=" + horasSueño + "]";
	}
	
}
