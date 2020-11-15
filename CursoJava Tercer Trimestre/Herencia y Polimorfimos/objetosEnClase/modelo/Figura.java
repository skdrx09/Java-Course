package objetosEnClase.modelo;

public abstract class Figura implements Model {
	protected static float maximaSuperficie;
	private String nombre;

	public Figura() {
		nombre ="sin nombre";
	}

	public Figura(String pNombre) {
		super();
		this.nombre = pNombre;
	}

	public String getNombre() {					return nombre;			}
	public void setNombre(String pNombre) {		this.nombre = pNombre;	}

	public static float getMaximaSuperficie() {		return maximaSuperficie;	}
	
	public abstract float calcularPerimetro();

	public abstract float calcularSuperficie();
	
	public abstract String getValores();
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Figura)) {
			return false;
		}
		Figura other = (Figura) obj;
		if (nombre == null) {
			if (other.getNombre() != null) {
				return false;
			}
		} else if (!nombre.equals(other.getNombre())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "\nnombre=" + nombre ;
	}
	
	
	
	
	
	
	

}
