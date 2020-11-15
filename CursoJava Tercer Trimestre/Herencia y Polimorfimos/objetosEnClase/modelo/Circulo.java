package objetosEnClase.modelo;

public class Circulo extends Figura {
	private float radio;

	public Circulo() {	}
	public Circulo(String pNombre, float pRadio) {
		super(pNombre);
		radio=pRadio;
		Figura.maximaSuperficie = Math.max(Figura.maximaSuperficie, calcularSuperficie());
	}

	public float getRadio() {
		return radio;
	}
	public void setRadio(float radio) {
		this.radio = radio;
	}
	
	@Override
	public float calcularPerimetro() {		
		return (float)Math.PI * 2 * radio;
	}


	@Override
	public float calcularSuperficie() {
		return (float)Math.PI * radio * radio;
	}
	
	@Override
	public String getValores() {
		StringBuffer sb = new StringBuffer("r=");
		sb.append(radio);
		return sb.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(radio);
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
		if (!(obj instanceof Circulo)) {
			return false;
		}
		Circulo other = (Circulo) obj;
		if (Float.floatToIntBits(radio) != Float.floatToIntBits(other.radio)) {
			return false;
		}
	
		return true;
	}
	@Override
	public String toString() {
		return super.toString() + "\nradio=" + radio ;
	}
	

	
}
