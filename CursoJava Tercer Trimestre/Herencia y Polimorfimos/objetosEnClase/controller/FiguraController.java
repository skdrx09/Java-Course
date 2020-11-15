package objetosEnClase.controller;

import objetosEnClase.controller.composite.ValidatorComposite;
import objetosEnClase.modelo.Figura;
import objetosEnClase.modelo.exception.FiguraException;

public class FiguraController implements Controller {

	public FiguraController() {
	}

	@Override
	public void addHandler(Figura fig) throws FiguraException {
		String strErrores=ValidatorComposite.getErrores(fig);
		if(!strErrores.isEmpty())
			throw new FiguraException(strErrores);
	

	}

	@Override
	public void leerHandler(Figura fig) throws FiguraException {
		

	}

	@Override
	public void modifyHandler(Figura fig) throws FiguraException {
		

	}

	@Override
	public void remomveHandler(Figura fig) throws FiguraException {
		

	}

}
