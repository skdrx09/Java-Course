package objetosEnClase.modelo;

public class Cuadrado extends Figura {
	private float lado;
	
	public Cuadrado() {
		super();
	}

	public Cuadrado(String pNombre, float pLado) {
		super(pNombre);
		lado=pLado;
		Figura.maximaSuperficie = Math.max(Figura.maximaSuperficie, calcularSuperficie());
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}
	
	@Override
	public float calcularPerimetro() {
		return lado*4; 

	}
	@Override
	public float calcularSuperficie() {
		return lado * lado;
	}

	
	@Override
	public String getValores() {
		StringBuffer sb = new StringBuffer("l=");
		sb.append(lado);
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Cuadrado)) {
			return false;
		}
		Cuadrado other = (Cuadrado) obj;
		if (Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado)) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "\nlado=" + lado;
	}
	
	
	

}
