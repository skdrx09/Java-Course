package objetosEnClase.controller.composite;

import java.util.ArrayList;
import java.util.List;

import objetosEnClase.modelo.Figura;


public abstract class ValidatorComposite {
	protected static Figura figura;
	
	public ValidatorComposite() {	}
	
	public static String getErrores(Figura fig){
		figura=fig;
		List<ValidatorComposite> validaciones = new ArrayList<>();
		validaciones.add(new FiguraNombreDobleEspacioComposite());
		validaciones.add(new FiguraNombreVacioComposite());
		validaciones.add(new CirculoRadioNegativoCeroComposite());
		validaciones.add(new CuadradoLadoNegativoCeroComposite());
		
		StringBuffer sbErrorers = new StringBuffer();
		for (ValidatorComposite validacion : validaciones) {
			if(validacion.isMe() && validacion.validar()){
				sbErrorers.append(validacion.getError());
				sbErrorers.append("\n");
			}
		}
		return sbErrorers.toString();
	}
	
	public abstract boolean isMe();
	public abstract boolean validar();
	public abstract String getError();
	
	

}
