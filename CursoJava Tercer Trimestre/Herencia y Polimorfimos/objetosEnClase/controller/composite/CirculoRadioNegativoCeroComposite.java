package objetosEnClase.controller.composite;

import objetosEnClase.modelo.Circulo;

public class CirculoRadioNegativoCeroComposite extends ValidatorComposite {

	public CirculoRadioNegativoCeroComposite() {	}

	@Override
	public boolean isMe() {		
		return figura instanceof Circulo;
	}

	@Override
	public boolean validar() {	
		Circulo cir = (Circulo)figura;
		return cir.getRadio()<=0;
	}

	@Override
	public String getError() {
		return "El radio debe ser mayor que 0";
	}

}
