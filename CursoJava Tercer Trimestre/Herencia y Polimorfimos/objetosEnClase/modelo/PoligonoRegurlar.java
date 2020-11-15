package objetosEnClase.modelo;

public class PoligonoRegurlar extends Figura {
	private float 	lado;
	private int 	cantidadDeLados;
	private float 	apotema;

	public PoligonoRegurlar() {	}

	public PoligonoRegurlar(String pNombre) {
		super(pNombre);
	}

	@Override
	public float calcularPerimetro() {
		return lado*cantidadDeLados;
	}

	@Override
	public float calcularSuperficie() {		
		return calcularPerimetro()*apotema/2;
	}

	@Override
	public String getValores() {
		StringBuffer sb = new StringBuffer("l=");
		sb.append(lado);
		sb.append(",n=");
		sb.append(cantidadDeLados);
		sb.append("ap=");
		sb.append(apotema);		
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(apotema);
		result = prime * result + cantidadDeLados;
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
		if (!(obj instanceof PoligonoRegurlar)) {
			return false;
		}
		PoligonoRegurlar other = (PoligonoRegurlar) obj;
		if (Float.floatToIntBits(apotema) != Float.floatToIntBits(other.apotema)) {
			return false;
		}
		if (cantidadDeLados != other.cantidadDeLados) {
			return false;
		}
		if (Float.floatToIntBits(lado) != Float.floatToIntBits(other.lado)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "lado=" + lado + ", cantidadDeLados=" + cantidadDeLados + ", apotema=" + apotema + "]";
	}

}
