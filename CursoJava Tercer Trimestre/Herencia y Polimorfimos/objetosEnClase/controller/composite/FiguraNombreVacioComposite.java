package objetosEnClase.controller.composite;

public class FiguraNombreVacioComposite extends ValidatorComposite {

	public FiguraNombreVacioComposite() {	}

	@Override
	public boolean isMe() {		
		return true;
	}

	@Override
	public boolean validar() {
		return figura.getNombre().isEmpty();
	}

	@Override
	public String getError() {
		return "El nombre no puede estar vacío";
	}

}
