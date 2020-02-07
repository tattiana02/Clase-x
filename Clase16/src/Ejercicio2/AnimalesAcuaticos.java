package Ejercicio2;

public class AnimalesAcuaticos extends Animales{

	private String tipoAmbiente;
	private String cantidadAletas;
	private String nivelAgresividad;
	
	public AnimalesAcuaticos(String nombre, String paisOrigen, String fechaIngreso, String tipoAmbiente, String cantidadAletas, String nivelAgresividad) {
		super(nombre, paisOrigen, fechaIngreso);
		this.tipoAmbiente = tipoAmbiente;
		this.cantidadAletas = cantidadAletas;
		this.nivelAgresividad = nivelAgresividad;
		
	}

	public String getTipoAmbiente() {
		return tipoAmbiente;
	}

	public void setTipoAmbiente(String tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public String getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(String cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public String getNivelAgresividad() {
		return nivelAgresividad;
	}

	public void setNivelAgresividad(String nivelAgresividad) {
		this.nivelAgresividad = nivelAgresividad;
	}

	@Override
	public String toString() {
		return "AnimalesAcuaticos [tipoAmbiente=" + tipoAmbiente + ", cantidadAletas=" + cantidadAletas
				+ ", nivelAgresividad=" + nivelAgresividad + "]";
	}
	
	
}
