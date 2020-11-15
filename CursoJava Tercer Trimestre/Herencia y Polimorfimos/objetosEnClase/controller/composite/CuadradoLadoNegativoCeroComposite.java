package objetosEnClase.controller.composite;

import objetosEnClase.modelo.Cuadrado;

public class CuadradoLadoNegativoCeroComposite extends ValidatorComposite {

	public CuadradoLadoNegativoCeroComposite() {	}

	@Override
	public boolean isMe() {		
		return figura instanceof Cuadrado;
	}

	@Override
	public boolean validar() {		
		Cuadrado cua = (Cuadrado) figura;
		return cua.getLado()<=0;
	}

	@Override
	public String getError() {		
		return "El lado debe ser mayor que 0";
	}

}
