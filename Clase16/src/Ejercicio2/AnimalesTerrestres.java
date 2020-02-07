package Ejercicio2;

public class AnimalesTerrestres extends Animales {
	
	private int cantidadPatas;
	private String tipoAlimentacion;
	private String horasSue�o;
	
	public AnimalesTerrestres(String nombre, String paisOrigen, String fechaIngreso, int cantidadPatas, String tipoAlimentacion, String horasSue�o) {
		super(nombre, paisOrigen, fechaIngreso);
		this.cantidadPatas = cantidadPatas;
		this.tipoAlimentacion = tipoAlimentacion;
		this.horasSue�o = horasSue�o;
		
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

	public String getHorasSue�o() {
		return horasSue�o;
	}

	public void setHorasSue�o(String horasSue�o) {
		this.horasSue�o = horasSue�o;
	}

	@Override
	public String toString() {
		return "AnimalesTerrestres [cantidadPatas=" + cantidadPatas + ", tipoAlimentacion=" + tipoAlimentacion
				+ ", horasSue�o=" + horasSue�o + "]";
	}
	
}
