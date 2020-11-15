package objetosEnClase.modelo;

public class Triangulo extends Figura {
	private float lado1;
	private float lado2;
	private float lado3;

	public Triangulo() {}

	public Triangulo(String pNombre) {
		super(pNombre);
		}

	@Override
	public float calcularPerimetro() {
		return lado1+lado2+lado3;
	}

	@Override
	public float calcularSuperficie() {
		return 0;
	}

	@Override
	public String getValores() {
		StringBuffer sb = new StringBuffer("l1=");
		sb.append(lado1);
		sb.append(",l2=");
		sb.append(lado2);
		sb.append(",l3=");
		sb.append(lado3);
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(lado1);
		result = prime * result + Float.floatToIntBits(lado2);
		result = prime * result + Float.floatToIntBits(lado3);
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
		if (!(obj instanceof Triangulo)) {
			return false;
		}
		Triangulo other = (Triangulo) obj;
		if (Float.floatToIntBits(lado1) != Float.floatToIntBits(other.lado1)) {
			return false;
		}
		if (Float.floatToIntBits(lado2) != Float.floatToIntBits(other.lado2)) {
			return false;
		}
		if (Float.floatToIntBits(lado3) != Float.floatToIntBits(other.lado3)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3;
	}

}
