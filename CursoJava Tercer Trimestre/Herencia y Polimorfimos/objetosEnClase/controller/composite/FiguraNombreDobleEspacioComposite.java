package objetosEnClase.controller.composite;

public class FiguraNombreDobleEspacioComposite extends ValidatorComposite {

	public FiguraNombreDobleEspacioComposite() {	}

	@Override
	public boolean isMe() {		
		return true;
	}

	@Override
	public boolean validar() {		
		return figura.getNombre().contains("  ");
	}

	@Override
	public String getError() {		
		return "El nombre no puede tener 2 espacios";
	}

}
