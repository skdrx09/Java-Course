package objetosEnClase.modelo;

public class TrianguloRectangulo extends Figura {
	private float base 	;
	private float altura;
	
	public TrianguloRectangulo() {}

	public TrianguloRectangulo(String pNombre) {
		super(pNombre);
	}

	
	public TrianguloRectangulo(String pNom, float pBase, float pAltura) {
		this(pNom);
		this.base = pBase;
		this.altura = pAltura;
		Figura.maximaSuperficie = Math.max(Figura.maximaSuperficie, calcularSuperficie());
	}

	public float getBase() {			return base;		}
	public void setBase(float pBase) {	this.base = pBase;	}

	public float getAltura() {				return altura;			}
	public void setAltura(float pAltura) {	this.altura = pAltura;	}

	@Override
	public float calcularPerimetro() {
		//calculo la hipotenusa
		float hip = (float)Math.sqrt(altura*altura + base*base);
		return base+altura+hip;
	}

	@Override
	public float calcularSuperficie() {
		return base*altura/2;
	}

	@Override
	public String getValores() {
		StringBuffer sb = new StringBuffer("b=");
		sb.append(base);
		sb.append("-a=");
		sb.append(altura);
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Float.floatToIntBits(altura);
		result = prime * result + Float.floatToIntBits(base);
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
		if (!(obj instanceof TrianguloRectangulo)) {
			return false;
		}
		TrianguloRectangulo other = (TrianguloRectangulo) obj;
		if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura)) {
			return false;
		}
		if (Float.floatToIntBits(base) != Float.floatToIntBits(other.base)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + "\nbase=" + base + "\naltura=" + altura;
	}
	

}
